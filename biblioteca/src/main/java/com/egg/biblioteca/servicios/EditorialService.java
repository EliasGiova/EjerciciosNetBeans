
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialService {
    
    @Autowired
    EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearEditorial(String nombre) throws MiException{
        validar(nombre);
        
        Editorial editorial = new Editorial();
        
        editorial.setNombre(nombre);
        
        editorialRepositorio.save(editorial);
    }
    
    public List <Editorial> listarEditoriales(){
        List<Editorial> editoriales = new ArrayList();
        
        editoriales = editorialRepositorio.findAll();//Trae todos las editoriales guardadas y la guarda en el arraylist editoriales
        
        return editoriales;
    }
    
    public Editorial GetOne(String id){ ////esta funcion sirve para retornar todos los atributos que contiene el ID
        return editorialRepositorio.getOne(id);
    }
    
    public void modificarEditorial(String id, String nombre) throws MiException{
        Optional <Editorial> respuestaEditorial = editorialRepositorio.findById(id);
        validar(nombre);
        if (respuestaEditorial.isPresent()) {
            Editorial editorial = respuestaEditorial.get();
            
            editorial.setNombre(nombre);
            
            editorialRepositorio.save(editorial);
        }
    }
    
    private void validar(String nombre) throws MiException {
        if (nombre == null || nombre.isEmpty()) {
            throw new MiException("la editorial no puede ser nulo o vacio");
        }
    }
}
