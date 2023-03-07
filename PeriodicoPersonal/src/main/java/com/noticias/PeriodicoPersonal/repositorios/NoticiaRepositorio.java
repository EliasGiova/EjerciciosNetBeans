
package com.noticias.PeriodicoPersonal.repositorios;

import com.noticias.PeriodicoPersonal.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepositorio extends JpaRepository <Noticia, Integer> {
    
    //buscar por titular de noticia
    @Query("SELECT n FROM Noticia n WHERE n.titulo = :titulo")
    public Noticia BuscarPorTitulo(@Param("titulo") String titulo);
    
    
}
