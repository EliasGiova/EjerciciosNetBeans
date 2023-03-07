package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro> {
    
    @Override
    public void guardar(Libro libro){
        super.guardar(libro);
    }
    
    @Override
    public void editar(Libro libro){
        super.editar(libro);
    }
    
    @Override
    public void eliminar(Libro libro){
        super.eliminar(libro);
    }
    
    public List <Libro> busquedaPorAutor(Autor autor){
    conectar();
    List <Libro> librosPorAutor = em.createQuery("SELECT l.autor.nombre "
            + "FROM Libro l WHERE :autor ").setParameter("Autor", autor).getResultList();
    desconectar();
    return librosPorAutor;
    } 
    
    public Libro busquedaPorISBN(String isbn){
        conectar();
        Libro librosPorISBN = (Libro) em.createQuery("SELECT l "
                + "FROM Libro l WHERE l.isbn LIKE :isbn").setParameter("isbn", isbn).getSingleResult();
        desconectar();
        return librosPorISBN;
    }
    
    public List <Libro> busquedaPorTitulo(String titulo){
        conectar();
        List <Libro> libroPorTitulo = em.createQuery("SELECT l "
                + "FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo", titulo).getResultList();
        desconectar();
        return libroPorTitulo;
    }
    
    public List <Libro> busquedaPorNombreAutor(String nombre){
        conectar();
        List <Libro> libroPorNombreAutor = em.createQuery("SELECT l "
                + "FROM Libro l WHERE l.autor.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return libroPorNombreAutor;
    }
    
    public List <Libro> busquedaPorEditorial (String nombre){
        conectar();
        List <Libro> libroPorEditorial = em.createQuery("SELECT l "
                + "FROM Libro l WHERE l.editorial.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return libroPorEditorial;
    }
    
    
    
}
