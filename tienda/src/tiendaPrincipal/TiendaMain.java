package tiendaPrincipal;

import java.util.Scanner;
import tiendaPrincipal.servicios.FabricanteService;
import tiendaPrincipal.servicios.ProductoService;

public class TiendaMain {

    public static void main(String[] args) {
        Scanner leer;
        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();
        int opcion;
        try {
            leer = new Scanner(System.in).useDelimiter("\n");
            do {
                System.out.println("Menu");
                System.out.println("1) Lista el nombre de todos los productos.");
                System.out.println("2) Lista los nombres y los precios de todos los productos");
                System.out.println("3) Listar aquellos productos que su precio esté entre 120 y 202.");
                System.out.println("4) Buscar y listar todos los Portátiles de la tabla producto.");
                System.out.println("5) Listar el nombre y el precio del producto más barato.");
                System.out.println("6) Ingresar un producto a la base de datos.");
                System.out.println("7) Ingresar un fabricante a la base de datos.");
                System.out.println("8) Editar un producto con datos a elección.");
                System.out.println("9) Lista de Fabricantes.");
                System.out.println("10) Quitar Producto.");
                System.out.println("11) Salir.");
                System.out.println("Ingrese el Numero para acceder al menu");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Nombres de Todos Los Productos");
                        ps.mostrarListaDeProductos();
                        break;
                    case 2:
                        System.out.println("Nombre + Precio de Todos Los Productos");
                        ps.mostrarNombreyPrecio();
                        break;
                    case 3:
                        System.out.println("Productos con Precios entre 120 y 202");
                        ps.mostrarPreciosEntre();
                        break;
                    case 4:
                        System.out.println("Buscar por Portatiles");
                        ps.mostrarProductosPortatiles();
                        break;
                    case 5:
                        System.out.println("Producto mas Barato");
                        ps.mostrarProductoMasBarato();
                        break;
                    case 6:
                        System.out.println("Agregar un Producto");
                        ps.incorporarProducto();
                        break;
                    case 7:
                        System.out.println("Agregar un Fabricante");
                        fs.incorporarFabricante();
                        break;
                    case 8:
                        System.out.println("Editar un Producto por Codigo");
                        System.out.print("Ingrese el Codigo del producto que desea modificar: ");
                        ps.modificarProducto(leer.next());
                        break;
                    case 9:
                        System.out.println("Lista de Fabricantes");
                        fs.mostrarListaDeFabricantes();
                        break;
                    case 10:
                        System.out.println("Quitar El Producto");
                        System.out.print("Ingrese el Codigo que sea Quitar: ");
                        ps.quitarProducto(leer.next());
                        break;
                    case 11:
                        System.out.println("Hasta Luego");
                        break;
                    default:
                        System.out.println("Opcion Incorrecta");
                        break;
                }
            } while (opcion != 11);
        } catch (Exception e) {
            System.out.println("No has puesto un numero");
        }
    }
}
