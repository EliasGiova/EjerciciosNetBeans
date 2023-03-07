
package com.noticias.PeriodicoPersonal.controladores;


import com.noticias.PeriodicoPersonal.entidades.Noticia;
import com.noticias.PeriodicoPersonal.excepciones.MiException;
import com.noticias.PeriodicoPersonal.servicios.NoticiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/noticia")//localhost:8080/noticia
public class NoticiaController {
    
    @Autowired
    private NoticiaService noticiaService;
    
    @GetMapping("/crearnoticia")//localhost:8080/noticia/crearnoticia
    public String crearNoticia(){
        return "noticia_crearnoticia.html";
    }
    
    @PostMapping("/noticiacreada")
    public String noticiaCreada(@RequestParam String titulo, @RequestParam String cuerpo, ModelMap modelo){
        try {
            Noticia noti = noticiaService.crearNoticia(titulo, cuerpo);
            System.out.println(noti);
            modelo.put("exito", "El autor se cargo con exito");
            
        } catch (MiException ex) {
             modelo.put("error", ex.getMessage());
             
             return "noticia_crearnoticia.html";
        }
        return "index.html";
    }
    
    @GetMapping("/listanoticias")
    public String listar(ModelMap modelo){
        List<Noticia> noticias = noticiaService.listanoticias();
        System.out.println(noticias);
        modelo.addAttribute("noticias", noticias);
        
        return "noticia_lista.html";
    }
}
