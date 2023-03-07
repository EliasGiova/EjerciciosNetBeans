
package com.egg.biblioteca.repositorios;

import com.egg.biblioteca.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
/*Esta capa se encarga de proveer un
API simple de usar, orientado al negocio, sin exponer complejidades propias de un repositorio de datos.
En esta capa se resuelven:
• cualquier acceso a la base de datos
• cualquier acceso a filesystem
• cualquier acceso a otros sistemas
• cualquier acceso a un repositorio de datos en cualquier forma.*/

public interface LibroRepositorio extends JpaRepository<Libro, Long> { //hereda de jpa a traves de la clase y su id

    //Buscar por nombre del libro
    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    public Libro buscarPorTitulo(@Param("titulo") String titulo);
    
    //Buscar por nombre del autor
    @Query("SELECT l FROM Libro l WHERE l.autor.nombre = :nombre")
    public List <Libro> buscarPorAutor(@Param("nombre") String nombre);
    }

