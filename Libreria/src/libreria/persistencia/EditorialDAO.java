package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

public class EditorialDAO extends DAO<Editorial> {

@Override
public void guardar(Editorial editorial){
    super.guardar(editorial);
}

@Override
public void eliminar(Editorial editorial){
    super.eliminar(editorial);
}

@Override
public void editar(Editorial editorial){
    super.editar(editorial);
}

public List <Editorial> listaEditorial(){
    conectar();
    List <Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e").getResultList();
    desconectar();
    return editoriales;
}
}
