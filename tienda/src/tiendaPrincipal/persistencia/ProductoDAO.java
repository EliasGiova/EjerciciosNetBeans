package tiendaPrincipal.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import tiendaPrincipal.dominio.productos.Producto;

public final class ProductoDAO extends DAO {

    private Scanner leer;

    //a) Lista el nombre de todos los productos que hay en la tabla producto.
    public ArrayList<Producto> listaProducto() throws Exception {
        try {
            String sql = "SELECT * FROM producto;";
            consultarBase(sql);
            Producto producto = null;

            ArrayList<Producto> productos = new ArrayList<>();

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }

            desconectarBase();

            return productos;

        } catch (Exception e) {
            throw e;
        }
    }

    //b) Lista los nombres y los precios de todos los productos de la tabla producto.
    public ArrayList<Producto> nombreyPrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto;";
            consultarBase(sql);
            Producto producto = null;

            ArrayList<Producto> listaNombreyPrecio = new ArrayList<>();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                listaNombreyPrecio.add(producto);
            }

            desconectarBase();

            return listaNombreyPrecio;

        } catch (Exception e) {
            throw e;
        }
    }

    //c) Listar aquellos productos que su precio esté entre 120 y 202.
    public ArrayList<Producto> preciosEntre() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202;";
            consultarBase(sql);
            Producto producto = null;

            ArrayList<Producto> precios = new ArrayList<>();

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                precios.add(producto);
            }

            desconectarBase();

            return precios;

        } catch (Exception e) {
            throw e;
        }
    }

    //d) Buscar y listar todos los Portátiles de la tabla producto.
    public ArrayList<Producto> buscarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%portátil%';";
            consultarBase(sql);
            Producto producto = null;

            ArrayList<Producto> portatiles = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                portatiles.add(producto);
            }
            desconectarBase();

            return portatiles;

        } catch (Exception e) {
            throw e;
        }
    }

    //e) Listar el nombre y el precio del producto más barato.
    public ArrayList<Producto> precioBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto "
                    + "WHERE precio = (SELECT min(precio) FROM producto);";
            consultarBase(sql);
            Producto producto = null;

            ArrayList<Producto> barato = new ArrayList<>();

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                barato.add(producto);
            }
            desconectarBase();

            return barato;

        } catch (Exception e) {
            throw e;
        }
    }

    //f) Ingresar un producto a la base de datos.
    public void agregarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar producto");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ( " + producto.getCodigo() + " , '" + producto.getNombre() + "' , " + producto.getPrecio() + " , "
                    + producto.getCodigoFabricante() + ");";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    //h) Editar un producto con datos a elección.
    public Producto buscarProductoYModificarPorCodigo(String codigo) throws Exception {
        try {
            leer = new Scanner(System.in).useDelimiter("\n");
            String sql = "SELECT * FROM producto"
                    + " WHERE codigo = '" + codigo + "';";

            consultarBase(sql);
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                System.out.println("Ingrese el nuevo nombre del producto: ");
                String prod = leer.next();
                System.out.println("Ingrese el nuevo precio del producto: ");
                double precio = leer.nextDouble();
                System.out.println("Ingrese el nuevo codigo del fabricante: ");
                int codFab = leer.nextInt();
                if (prod == null) {
                    producto.setNombre(resultado.getString(2));
                } else {
                    producto.setNombre(prod);
                }
                if (precio == 0) {
                    producto.setPrecio(resultado.getDouble(3));
                } else {
                    producto.setPrecio(precio);
                }
                if (codFab == 0) {
                    producto.setCodigoFabricante(resultado.getInt(4));
                } else {
                    producto.setCodigoFabricante(codFab);
                }
                sql = "UPDATE producto SET "
                        + "nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio()
                        + ", codigo_fabricante = " + producto.getCodigoFabricante()
                        + " WHERE codigo = '" + codigo + "';";    
            }
            
            insertarModificarEliminar(sql);
            
            return producto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }finally{
            desconectarBase();
        }
    }

    public void eliminarProducto(String codigo) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo = " + codigo + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
