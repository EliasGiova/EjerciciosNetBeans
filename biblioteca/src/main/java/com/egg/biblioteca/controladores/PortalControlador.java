
package com.egg.biblioteca.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//clase controladora
@RequestMapping("/")//configura cual es la url que va escuchar este controlador, en este caso la /
public class PortalControlador { //localhost:8080/
    
    @GetMapping("/")//mapea la url cuando simplemente se haya ingresado la /
    public String index(){ //localhost:8080/
        
        return "index.html"; // devuelve la vista que se quiere que se renderice
    }
    
}
