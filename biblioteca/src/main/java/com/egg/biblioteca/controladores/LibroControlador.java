package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.AutorService;
import com.egg.biblioteca.servicios.EditorialService;
import com.egg.biblioteca.servicios.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/libro")
public class LibroControlador {

    @Autowired
    private LibroService libroService;

    @Autowired
    private AutorService autorService;

    @Autowired
    private EditorialService editorialService;

    @GetMapping("/registrar")//localhost:8080/libro/registrar
    public String registrar(ModelMap modelo) {
        List<Autor> autores = autorService.listarAutores();
        List<Editorial> editoriales = editorialService.listarEditoriales();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);
        return "libro_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam String titulo,//required=false, es por si viene nulo igual entra al controlador
            @RequestParam(required = false) Integer ejemplares, @RequestParam String idAutor,
            @RequestParam String idEditorial, ModelMap modelo, @RequestParam(required = false) MultipartFile archivo) {//modelo en spring sirve para insertar todos los atributos para luego mostrarlo por pantalla

        try {
            libroService.crearLibro(archivo, isbn, titulo, ejemplares, idAutor, idEditorial); //si todo sale bien retornamos al index

            modelo.put("exito", "El libro fue cargado correctamente");

        } catch (MiException ex) {
            List<Autor> autores = autorService.listarAutores();
            List<Editorial> editoriales = editorialService.listarEditoriales();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            modelo.put("error", ex.getMessage());
            return "libro_form.html"; //volvemos a cargar el formulario
        }

        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Libro> libros = libroService.listarLibros();

        modelo.addAttribute("libros", libros);

        return "libro_list.html";
    }

    @GetMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, ModelMap modelo) {
      
        modelo.put("libro", libroService.GetOne(isbn));
        
        List<Autor> autores = autorService.listarAutores();
        List<Editorial> editoriales = editorialService.listarEditoriales();
        
        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);
        
        return "libro_modificar.html";
    }
    
    @PostMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial, ModelMap modelo, MultipartFile archivo) {
        try {
            List<Autor> autores = autorService.listarAutores();
            List<Editorial> editoriales = editorialService.listarEditoriales();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            libroService.modificarLibro(archivo, isbn, titulo, ejemplares, idAutor, idEditorial);

            return "redirect:../lista";

        } catch (MiException ex) {
            List<Autor> autores = autorService.listarAutores();
            List<Editorial> editoriales = editorialService.listarEditoriales();

            modelo.put("error", ex.getMessage());

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            return "libro_modificar.html";
        }
    }
}
