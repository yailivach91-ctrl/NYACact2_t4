package springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller 
public class EjemploController {

    @GetMapping("/detalles_info")

    
    public String info(Model model) {
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "stringboot-applications");
        model.addAttribute("Ip", "162.168.1.0");
        return "detalles_info";
    }
}
