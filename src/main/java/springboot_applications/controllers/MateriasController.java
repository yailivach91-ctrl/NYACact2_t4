package springboot_applications.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MateriasController {

    @GetMapping("/materias")
    public List<String> materias() {
        return List.of("Lenguajes y Autómatas", "Programación Web", "Bases de Datos");
    }
}
