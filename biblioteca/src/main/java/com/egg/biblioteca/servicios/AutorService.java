
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    
    @Autowired
    AutorRepositorio autorRepositorio;
    
    @Transactional
    public void crearAutor(String nombre) throws MiException{
        Autor autor = new Autor();
        
        validar(nombre);
        
        autor.setNombre(nombre);
        
        autorRepositorio.save(autor);
    }
    
    public List<Autor> listarAutores(){
        List<Autor> autores = new ArrayList();
        
        autores = autorRepositorio.findAll();//Trae todos los autores guardados y la guarda en el arraylist autores
        
        return autores;
    }
    
    public void modificarAutor(String nombre, String id) throws MiException{
        
        Optional<Autor> respuestaAutor = autorRepositorio.findById(id);
        validar(nombre);
        if (respuestaAutor.isPresent()) {//este opcional esta presente
    
            Autor autor = respuestaAutor.get();//podemos modificar el autor
            
            autor.setNombre(nombre);
            
            autorRepositorio.save(autor);
        }
    }

    public Autor GetOne(String id){ //esta funcion sirve para retornar todos los atributos que contiene el ID
        return autorRepositorio.getOne(id);
    }
    private void validar(String nombre) throws MiException {
        if (nombre == null || nombre.isEmpty()) {
            throw new MiException("El autor no puede ser nulo o vacio");
        }
    }
}
