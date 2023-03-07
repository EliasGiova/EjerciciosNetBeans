package tiendaPrincipal.servicios;

import java.util.Scanner;
import tiendaPrincipal.dominio.fabricante.Fabricante;
import tiendaPrincipal.persistencia.FabricanteDAO;

public class FabricanteService {
    private Scanner leer;
    FabricanteDAO fabricaDAO = new FabricanteDAO();
    
    public void mostrarListaDeFabricantes(){
        try {
            System.out.println("Codigo\t        Nombre Fabricante");
            for(Fabricante aux : fabricaDAO.listaFabricante()){
                System.out.println(aux.getCodigo() + "\t " + aux.getNombre());
            }
        } catch (Exception e) {
            System.out.println("Carga Incorrecta De Fabricantes");
        }
    }
    
    public void incorporarFabricante(){
        Fabricante nuevo = new Fabricante();
        try {
            leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese Codigo Del Fabricante");
            nuevo.setCodigo(leer.nextInt());
            System.out.println("Ingrese el Nombre Del Fabricante");
            nuevo.setNombre(leer.next());
            fabricaDAO.agregarFabricante(nuevo);
        } catch (Exception e) {
            System.out.println("ERROR EN LA CARGA DEL FABRICANTE");
        }
    }
    
    public void quitarFabricante(String codigo){
        try {
            fabricaDAO.eliminarFabricante(codigo);
        } catch (Exception e) {
            System.out.println("ERROR AL ELIMINAR EL FABRICANTE");
        }
    }
}
