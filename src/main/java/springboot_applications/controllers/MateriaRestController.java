
package springboot_applications.controllers;

import springboot_applications.dto.MateriaDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/materias")
public class MateriaRestController {

    @PostMapping
    public MateriaDTO recibirMateria(@RequestBody MateriaDTO materia) {

        return materia;
    }
}
