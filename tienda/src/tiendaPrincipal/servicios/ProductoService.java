package tiendaPrincipal.servicios;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;
import tiendaPrincipal.dominio.productos.Producto;
import tiendaPrincipal.persistencia.ProductoDAO;

public class ProductoService {
    private Scanner leer;
    ProductoDAO producDAO = new ProductoDAO();
    
    public void mostrarListaDeProductos(){
        try {
            System.out.println("Codigo\tNombre\t          Precio\tCodigo Fabricante\t");
            for (Producto aux : producDAO.listaProducto()) {
                System.out.println(aux.getCodigo() + "\t" + aux.getNombre() + " \t " + aux.getPrecio() + "\t"
                        + aux.getCodigoFabricante() +"\t");
            }
        } catch (Exception e) {
            System.out.println("ERROR EN LA LISTA DE PRODUCTOS" + e.getMessage());
        }
    }
    
    public void mostrarNombreyPrecio(){
        try {
            System.out.println("Nombre         \tPrecio");
            for (Producto aux : producDAO.nombreyPrecio()) {
                System.out.println(aux.getNombre() + "\t" + aux.getPrecio());
            }
        } catch (Exception e) {
            System.out.println("ERROR EN LA LISTA DE NOMBRES Y PRECIOS" + e.getMessage());
        }
    }
    
    public void mostrarPreciosEntre(){
        try {
            System.out.println("Codigo\tNombre\t       Precio\tCodigo Fabricante\t");
            for (Producto aux : producDAO.preciosEntre()) {
                System.out.println(aux.getCodigo() + "\t" + aux.getNombre() + " \t " + aux.getPrecio() + "\t"
                        + aux.getCodigoFabricante() +"\t");
            }
        } catch (Exception e) {
            System.out.println("ERROR EN LA LISTA PRECIOS ENTRE 120 Y 202");
        }
    }
    
    public void mostrarProductoMasBarato(){
        try {
            System.out.println("Nombre\t          Precio\t");
            for(Producto aux : producDAO.precioBarato()){
                System.out.println(aux.getNombre() + " \t " + aux.getPrecio());
            }
        } catch (Exception e) {
            System.out.println("ERROR EN EL PRODUCTO MAS BARATO");
        }
    }
    
    public void mostrarProductosPortatiles(){
        try {
            System.out.println("Codigo\tNombre\t          Precio\tCodigo Fabricante\t");
            for (Producto aux : producDAO.buscarPortatiles()) {
                System.out.println(aux.getCodigo() + "\t" + aux.getNombre() + " \t " + aux.getPrecio() + "\t"
                        + aux.getCodigoFabricante() +"\t");
            }
        } catch (Exception e) {
            System.out.println("ERROR EN LA BUSQUEDA DE PORTATILES");
        }
    }
    
    public void incorporarProducto(){
        Producto nuevo = new Producto();
        try {
            leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese Codigo De Producto");
            nuevo.setCodigo(leer.nextInt());
            System.out.println("Ingrese el Nombre Del Producto");
            nuevo.setNombre(leer.next());
            System.out.println("Ingrese el Precio Del Producto");
            nuevo.setPrecio(leer.nextDouble());
            System.out.println("Ingrese el Codigo Del Fabricante");
            nuevo.setCodigoFabricante(leer.nextInt());
            producDAO.agregarProducto(nuevo);
        } catch (Exception e) {
            System.out.println("ERROR EN LA CARGA DE PRODUCTO");
        }
    }
    
    public void modificarProducto(String codigo){
        try {
            producDAO.buscarProductoYModificarPorCodigo(codigo);
        } catch (Exception e) {
            System.out.println("Error AQUI! ");
        }
    }
    
    public void quitarProducto(String codigo){
        try {
            producDAO.eliminarProducto(codigo);
        } catch (Exception e) {
            System.out.println("El Codigo del producto no existe");
        }
    }
    
    public void limpiarPantalla() throws AWTException {

        Robot pressbot = new Robot();
        pressbot.setAutoDelay(30);
        pressbot.keyPress(17);
        pressbot.keyPress(76);
        pressbot.keyRelease(17);
        pressbot.keyRelease(76);
    }

}
