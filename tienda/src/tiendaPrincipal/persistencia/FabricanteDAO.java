package tiendaPrincipal.persistencia;

import java.util.ArrayList;
import tiendaPrincipal.dominio.fabricante.Fabricante;

public final class FabricanteDAO extends DAO {

    public ArrayList <Fabricante> listaFabricante() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante";
            consultarBase(sql);
            Fabricante fabricante = null;
            
            ArrayList <Fabricante> fabricantes = new ArrayList<>();
            
            while(resultado.next()){
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                fabricantes.add(fabricante);
            }
            desconectarBase();
            
            return fabricantes;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    //g) Ingresar un fabricante a la base de datos
    public void agregarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO fabricante (codigo, nombre)"
                    + "VALUES ( " + fabricante.getCodigo() + " , '" + fabricante.getNombre() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricante (String codigo) throws Exception{
        try {
            String sql = "DELETE FROM fabricante WHERE codigo = " + codigo;
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }  
    }
}
