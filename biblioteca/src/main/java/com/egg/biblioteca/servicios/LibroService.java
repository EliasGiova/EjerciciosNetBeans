package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import com.egg.biblioteca.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class LibroService {
    
    @Autowired//esta variable ya esta instanciada
    private LibroRepositorio libroRepositorio;
    
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional// son todos aquellos metodos que generen modificaciones permanentemente en la base de datos
    public void crearLibro(MultipartFile archivo, Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
        
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
        
        Autor autor = autorRepositorio.findById(idAutor).get();
        Editorial editorial = editorialRepositorio.findById(idEditorial).get();
        Libro libro = new Libro();
        
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAlta(new Date());
        
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        libroRepositorio.save(libro);
    }
    
    public List<Libro> listarLibros(){//retorna una lista de libros
        List<Libro> libros = new ArrayList();
        
        libros = libroRepositorio.findAll();//Trae todos los libros guardados y la guarda en el arraylist libros
        
        return libros;
    }
    
    public Libro GetOne(Long isbn){
        return libroRepositorio.getOne(isbn);
    }
    
    public void modificarLibro(MultipartFile archivo, Long isbn, String titulo, Integer ejempleares, String idAutor, String idEditorial) throws MiException{
        
        validar(isbn, titulo, ejempleares, idAutor, idEditorial);
        
        Optional<Libro> respuestaLibro = libroRepositorio.findById(isbn);//el optional es un objeto contenedor que puede o no contener un objeto null
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        
        if (respuestaAutor.isPresent()) {//Verifica que este opcional esta presente
            autor = respuestaAutor.get();//podemos modificar el autor
        }
        
        if (respuestaEditorial.isPresent()) {//Verifica que este opcional esta presente
            editorial = respuestaEditorial.get();//podemos modificar la editorial
        }
        
        if (respuestaLibro.isPresent()) {//Verifica que este opcional esta presente
            
            Libro libro = respuestaLibro.get();//podemos modificar el libro
            
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setEjemplares(ejempleares);
            
            libroRepositorio.save(libro);
        }
    }
    
    private void validar(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial ) throws MiException {
        if (isbn == null) {
            throw new MiException("el isbn no puede ser nulo");
        }
         if (titulo.isEmpty() || titulo == null) {
            throw new MiException("el titulo no puede ser nulo o estar vacio");
        }
          if (ejemplares == null) {
            throw new MiException("los ejemplares no pueden ser nulo");
        }
           if (idAutor.isEmpty() ||idAutor == null) {
            throw new MiException("el autor no puede ser nulo o estar vacio");
        }
           if (idEditorial.isEmpty()|| idEditorial == null) {
            throw new MiException("la editorial no puede ser nulo o estar vacio");
        }
    }
}
