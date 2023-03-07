package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

public class AutorDAO extends DAO<Autor>{
    
@Override
public void guardar(Autor autor){
    super.guardar(autor);
}

@Override
public void eliminar(Autor autor){
    super.eliminar(autor);
}

@Override
public void editar(Autor autor){
    super.editar(autor);
}

public List<Autor> listaAutores(){
    conectar();
    List <Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
    desconectar();
    return autores;
}
}
