package servicio;

import entidad.Alumno;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidad.Comparadores;

/**
 * Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la
 * nacionalidad y su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA –
 * CHILENA – VENEZOLANA solamente. Necesidades:  Crear los métodos de A – B -M
 * (Alta – Baja – modificación ) que manipulen los objetos de este tipo.  Crear
 * una lista de 20 alumnos (hacer uso del constructor que recibe parámetros,
 * para no hacer carga manual de los datos)  Ordenar y mostrar la lista de
 * alumnos ordenados por orden alfabético según su apellido de forma ascendente.
 *  Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según
 * su nombre de forma descendente.  Con un alumno especifico (suponiendo que no
 * existen dos alumnos con el mismo nombre y apellido), mostrar por pantalla su
 * edad. Considerar, el manejo de fechas, utilizando el atributo fecha de
 * nacimiento.  Crear listas paralelas de Alumnos, según la nacionalidad. 
 * Realizar un reporte final de datos que informe: o Cuantos alumnos son mayores
 * de 25 años. o Cuantos alumnos tiene su apellido que comienzan con letra L o P
 * o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA – VENEZOLANA.
 * Recordar:  Hacer uso de paquetes y clases correspondientes para buena
 * estructura de nuestro proyecto.  Todos los métodos deben ser pensados para
 * reutilizar y adaptarse a futuros cambios (por ejemplo, mañana quiero carga de
 * 30 alumnos, y las instrucciones deben prevenir esta modificación)
 *
 * @author Raul Gomez
 */
public class ServicioAlumno {

    private Scanner leer;
    private Alumno alumno;
    private ArrayList<Alumno> listaAlumnos;

    public ServicioAlumno() {
        leer = new Scanner(System.in).useDelimiter("\n");
        listaAlumnos = new ArrayList<>();
    }

    public void listaAlumnos() {
        Alumno a1 = new Alumno("raul", "gomez", "argentino", 44);
        listaAlumnos.add(a1);
        Alumno a2 = new Alumno("pablo", "fuentes", "argentino", 40);
        listaAlumnos.add(a2);
        Alumno a3 = new Alumno("marce", "rodriguez", "argentino", 30);
        listaAlumnos.add(a3);
        Alumno a4 = new Alumno("itai", "bejar", "argentino", 42);
        listaAlumnos.add(a4);
        Alumno a5 = new Alumno("juan", "ambrosini", "argentino", 27);
        listaAlumnos.add(a5);
        Alumno a6 = new Alumno("pablo", "bordon", "argentino", 35);
        listaAlumnos.add(a6);
        Alumno a7 = new Alumno("marian", "castañer", "argentino", 33);
        listaAlumnos.add(a7);
        Alumno a8 = new Alumno("ignacio", "moreno", "argentino", 44);
        listaAlumnos.add(a8);
        Alumno a9 = new Alumno("elias", "giovanela", "argentino", 25);
        listaAlumnos.add(a9);
        Alumno a10 = new Alumno("tomas", "dabul", "argentino", 28);
        listaAlumnos.add(a10);
        Alumno a11 = new Alumno("stefano", "gianoni", "argentino", 24);
        listaAlumnos.add(a11);
        Alumno a12 = new Alumno("facundo", "alvarez", "argentino", 27);
        listaAlumnos.add(a12);
        Alumno a13 = new Alumno("neri", "cisterna", "argentino", 32);
        listaAlumnos.add(a13);
        Alumno a14 = new Alumno("leonardo", "acosta", "argentino", 22);
        listaAlumnos.add(a14);
        Alumno a15 = new Alumno("franco", "orozco", "argentino", 25);
        listaAlumnos.add(a15);
        Alumno a16 = new Alumno("tomas", "balverde", "argentino", 42);
        listaAlumnos.add(a16);
        Alumno a17 = new Alumno("mari", "massaro", "argentino", 30);
        listaAlumnos.add(a17);
        Alumno a18 = new Alumno("caty", "fernandez", "venezolano", 28);
        listaAlumnos.add(a18);
        Alumno a19 = new Alumno("jonathan", "perez", "venezolano", 23);
        listaAlumnos.add(a19);
        Alumno a20 = new Alumno("pepe", "hongo", "chileno", 58);
        listaAlumnos.add(a20);

    }

    private void altaAlumno() {
        Alumno alumno = new Alumno();
        System.out.println("Ingrese Nombre del alumno");
        alumno.setNombre(leer.next());
        System.out.println("Ingrese apellido del alumno");
        alumno.setApellido(leer.next());
        System.out.println("Ingrese Nacionalidad del alumno(solo Argentino o "
                + "Chileno o Venezolano):");
        alumno.setNacionalidad(leer.next());
        if (!alumno.getNacionalidad().equalsIgnoreCase("argentino")) {
            System.out.println("Ingrese una Nacionalidad válida");
            alumno.setNacionalidad(leer.next());
        } else if (!alumno.getNacionalidad().equalsIgnoreCase("chileno")) {
            System.out.println("Ingrese una Nacionalidad válida");
            alumno.setNacionalidad(leer.next());
        } else if (!alumno.getNacionalidad().equalsIgnoreCase("venezolano")) {
            System.out.println("Ingrese una Nacionalidad válida");
            alumno.setNacionalidad(leer.next());
        }
        System.out.println("Ingrese Fecha de Nacimiento del alumno");
        System.out.print("Dia(dd): ");
        int dia = leer.nextInt();
        System.out.print("Mes(mm): ");
        int mes = leer.nextInt();
        System.out.print("Año(aaaa): ");
        int anio = leer.nextInt();
        alumno.setFechaNac(LocalDate.of(anio, mes, dia));
        Period edad = Period.between(alumno.getFechaNac(), LocalDate.now());
        alumno.setEdad(edad.getYears());
        listaAlumnos.add(alumno);
    }

    private void bajaAlumno() {
        System.out.println("A continuacion le pediremos Apellido y nombre "
                + "del alumno a dar de baja");
        System.out.println("Ingrese Apellido del alumno a dar Baja:");
        String bajaAlumApell = leer.next().toLowerCase();
        System.out.println("Ingrese nombre del alumno a dar Baja:");
        String bajaAlumNombre = leer.next().toLowerCase();
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getApellido().contains(bajaAlumApell)
                    && listaAlumnos.get(i).getNombre().contains(bajaAlumNombre)) {
                listaAlumnos.remove(i);
                System.out.println("El alumno " + bajaAlumApell.toUpperCase()
                        + ", " + bajaAlumNombre.toUpperCase() + " ha sido dado "
                        + "de baja");
            }

        }

    }

    private void modificarAlumno() {
        String op = "";
        System.out.println("A continuacion le pediremos Apellido y nombre del "
                + "alumno que desea modificar");
        System.out.println("Ingrese Apellido del alumno a dar modificar:");
        String modificaAlumApell = leer.next();
        System.out.println("Ingrese nombre del alumno a dar modificar:");
        String modificaAlumNombre = leer.next();
        for (Alumno aux : listaAlumnos) {
            if (aux.getApellido().equalsIgnoreCase(modificaAlumApell)
                    && aux.getNombre().equalsIgnoreCase(modificaAlumNombre)) {
                do {
                    System.out.println("Ingrese que dato del alumno desea "
                            + "modificar?");
                    System.out.println("nombre\napellido\nedad\nnacionalidad");
                    String modificar = leer.next().toLowerCase();
                    switch (modificar) {
                        case "nombre":
                            System.out.println("Ingrese el nuevo nombre:");
                            aux.setNombre(leer.next());
                            break;
                        case "apellido":
                            System.out.println("Ingrese el nuevo apellido:");
                            aux.setApellido(leer.next());
                            break;
                        case "edad":
                            System.out.println("Ingrese la nueva edad:");
                            aux.setEdad(leer.nextInt());
                            break;
                        case "nacionalidad":
                            System.out.println("Ingrese la nueva "
                                    + "nacionalidad:");
                            aux.setNacionalidad(leer.next());
                            if (!aux.getNacionalidad().equalsIgnoreCase("argentino")) {
                                System.out.println("Ingrese una Nacionalidad válida");
                                aux.setNacionalidad(leer.next());
                            } else if (!aux.getNacionalidad().equalsIgnoreCase("chileno")) {
                                System.out.println("Ingrese una Nacionalidad válida");
                                aux.setNacionalidad(leer.next());
                            } else if (!aux.getNacionalidad().equalsIgnoreCase("venezolano")) {
                                System.out.println("Ingrese una Nacionalidad válida");
                                aux.setNacionalidad(leer.next());
                            }
                            break;
                        default:
                            System.out.println("opcion no válida");
                            break;
                    }
                    System.out.println("desea cambiar otro dato?");
                    op = leer.next();
                } while (op.equalsIgnoreCase("s"));
            }
        }
    }

    private void ordenarLista() {
        boolean op = true;
        do {
            System.out.println("especifique como quiere ordenar la lista:" + "\n"
                    + "1.-Por Apellido Alfabeticamente\n"
                    + "2.-Por Nombre de manera Descendente\n"
                    + "3.-Salir");
            String orden = leer.next();
            switch (orden) {
                case "1":
                    Collections.sort(listaAlumnos, Comparadores.ordenarPorApellidoAscendente);
                    System.out.println(listaAlumnos);
                    break;
                case "2":
                    Collections.sort(listaAlumnos, Comparadores.ordenarPorNombreDescendente);
                    System.out.println(listaAlumnos);
                    break;
                case "3":
                    System.out.println("Ha salido de ordenar lista...");
                    op = false;
            }
        } while (op);
    }

    /**
     * Con un alumno especifico (suponiendo que no existen dos alumnos con el
     * mismo nombre y apellido), mostrar por pantalla su edad. Considerar, el
     * manejo de fechas, utilizando el atributo fecha de nacimiento.
     */
    public void mostrarAlumno() {
        String op = "";
        System.out.println("A continuacion le pediremos Apellido y nombre del alumno que desea visualizar");
        System.out.println("Ingrese Apellido del alumno a visualizar:");
        String modificaAlumApell = leer.next();
        System.out.println("Ingrese nombre del alumno a visualizar:");
        String modificaAlumNombre = leer.next();
        for (Alumno aux : listaAlumnos) {
            if (aux.getApellido().equalsIgnoreCase(modificaAlumApell) && aux.getNombre().equalsIgnoreCase(modificaAlumNombre)) {
                System.out.println("Alumno: " + aux.getApellido() + ", " + aux.getNombre() + "\t edad:\t" + aux.getEdad() + " años");
            }
        }
    }

    /**
     * Crear listas paralelas de Alumnos, según la nacionalidad.  Realizar un
     * reporte final de datos que informe: o Cuantos alumnos son mayores de 25
     * años. o Cuantos alumnos tiene su apellido que comienzan con letra L o P o
     * Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA – VENEZOLANA.
     */
    public void generarReportes() {
        ArrayList<Alumno> listaArgentinos = new ArrayList<>();
        ArrayList<Alumno> listaVenezolanos = new ArrayList<>();
        ArrayList<Alumno> listaChilenos = new ArrayList<>();
        ArrayList<Alumno> listaMayores25 = new ArrayList<>();
        ArrayList<Alumno> listaMenores25 = new ArrayList<>();
        ArrayList<Alumno> listaApellLoP = new ArrayList<>();
        String op = "";
        boolean bucle = true;
        for (Alumno aux : listaAlumnos) {
            if (aux.getNacionalidad().equalsIgnoreCase("argentino")) {
                listaArgentinos.add(aux);
            } else if (aux.getNacionalidad().equalsIgnoreCase("venezolano")) {
                listaVenezolanos.add(aux);
            } else if (aux.getNacionalidad().equalsIgnoreCase("chileno")) {
                listaChilenos.add(aux);
            }
            if (aux.getEdad() < 25) {
                listaMenores25.add(aux);
            } else if (aux.getEdad() > 25) {
                listaMayores25.add(aux);
            }
            if (aux.getApellido().substring(0, 1).equalsIgnoreCase("l")) {
                listaApellLoP.add(aux);
            } else if (aux.getApellido().substring(0, 1).equalsIgnoreCase("p")) {
                listaApellLoP.add(aux);
            }
        }
        do {
            System.out.println("Ingrese el informe que desea crear:\n"
                    + "1.-Alumnos de Nacionalidad Argentinos\n"
                    + "2.-Alumnos de Nacionalidad Venezolanos\n"
                    + "3.-Alumnos de Nacionalidad Chilenos\n"
                    + "4.-Alumnos Menores de 25 años\n"
                    + "5.-Alumnos Mayores de 25 años\n"
                    + "6.-Alumnos cuyo apellido comienza con la letra L o la letra P\n"
                    + "7.-Salir");
            op = leer.next();

            switch (op) {
                case "1":
                    System.out.println("Cantidad: " + listaArgentinos.size() + " alumnos Argentinos");
                    System.out.println(listaArgentinos);
                    break;
                case "2":
                    System.out.println("Cantidad: " + listaVenezolanos.size() + " alumnos Venezolanos");
                    System.out.println(listaVenezolanos);
                    break;
                case "3":
                    System.out.println("Cantidad: " + listaChilenos.size() + " alumnos Chilenos");
                    System.out.println(listaChilenos);
                    break;
                case "4":
                    System.out.println("Cantidad: " + listaMenores25.size() + " alumnos Menores de 25 años");
                    System.out.println(listaMenores25);
                    break;
                case "5":
                    System.out.println("Cantidad: " + listaMayores25.size() + " alumnos Mayores de 25 años");
                    System.out.println(listaMayores25);
                    break;
                case "6":
                    System.out.println("Cantidad: " + listaApellLoP.size() + " alumnos que su apellido comienza con L o P");
                    System.out.println(listaApellLoP);
                    break;
                case "7":
                    bucle = false;
                    System.out.println("gracias por utilizar nuestros servicios!!");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while (bucle);
    }

    public void menu() {
        boolean bucle = true;
        do {
            System.out.println("*****************MENU*****************");
            System.out.println("1.-Altas Alumnos\n"
                    + "2.-Modificar Alumnos\n"
                    + "3.-Bajas Alumnos\n"
                    + "4.-Visualizar lista de Alumnos según criterio de orden\n"
                    + "5.-Mostrar Alumno\n"
                    + "6.-Generar Reportes(segmentado ej. edad, nacionalidad, etc.\n"
                    + "x.-Salir");
            System.out.println("**************************************");
            System.out.println("Seleccione una opcion: ");
            String op = leer.next();
            switch (op) {
                case "1":
                    altaAlumno();
                    break;
                case "2":
                    modificarAlumno();
                    break;
                case "3":
                    bajaAlumno();
                    break;
                case "4":
                    ordenarLista();
                    break;
                case "5":
                    mostrarAlumno();
                    break;
                case "6":
                    generarReportes();
                    break;
                case "x":
                    System.out.println("Gracias por utilizar nuestros servicios!!");
                    bucle = false;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while (bucle);
    }
}
