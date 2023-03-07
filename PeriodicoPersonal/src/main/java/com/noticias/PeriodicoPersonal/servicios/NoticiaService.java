
package com.noticias.PeriodicoPersonal.servicios;

import com.noticias.PeriodicoPersonal.entidades.Noticia;
import com.noticias.PeriodicoPersonal.excepciones.MiException;
import com.noticias.PeriodicoPersonal.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaService {
    
    @Autowired
    private NoticiaRepositorio noticiaRepo;
    
    @Transactional
    public Noticia crearNoticia(String titulo, String cuerpo) throws MiException{
        
        validar(titulo, cuerpo);
        
        Noticia noti = new Noticia();
        
        noti.setTitulo(titulo);
        noti.setCuerpo(cuerpo);
        
        noticiaRepo.save(noti);
        return noti;
    }
    //n° gestion 33340065
    
    public List<Noticia>listanoticias(){
        
        List<Noticia>noticias = new ArrayList();
        
        noticias = noticiaRepo.findAll();
        
        return noticias;
    }
    
    public void modificarNoticia(Integer id, String titulo, String cuerpo) throws MiException{
        Optional<Noticia> respNoticia = noticiaRepo.findById(id);//el optional es un objeto contenedor que puede o no contener un objeto null
        validar(titulo, cuerpo);
        if(respNoticia.isPresent()){//me fijo si esta presenta
            
            Noticia noti = respNoticia.get();//traigo la noticia para modificar con valores distintos
            
            noti.setCuerpo(cuerpo);//modifico
            noti.setTitulo(titulo);
            
            noticiaRepo.save(noti);
        }
    }
    
    public void eliminarNoticia(Integer id){
        Optional<Noticia> respNoticia = noticiaRepo.findById(id);
        if (respNoticia.isPresent()){
          Noticia noti = respNoticia.get();
          
          noticiaRepo.delete(noti);
        }
    }
    
    public Noticia GetOne(Integer id){//esta funcion sirve para retornar todos los atributos que contiene el ID
        return noticiaRepo.getOne(id);
    }
    
    private void validar(String titulo, String cuerpo) throws MiException {
       
        if(titulo.isEmpty() || titulo == null){
            throw new MiException("El titulo no puede estar vacio");
        }
        if(cuerpo.isEmpty() || cuerpo == null){
            throw new MiException("El cuerpo de la noticia no puede estar vacio");
        }
    }
}
