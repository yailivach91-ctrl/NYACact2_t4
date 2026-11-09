
package springboot_applications.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import springboot_applications.dto.MateriaDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Value;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MateriaController {

    private List<MateriaDTO> materias = new ArrayList<>();

    public MateriaController() {
        materias.add(new MateriaDTO("Programación Web", "Adelina", 5));
        materias.add(new MateriaDTO("Bases de Datos", "Carlos", 6));
        materias.add(new MateriaDTO("Lenguajes y Autómatas", "María", 5));
    }

    @GetMapping("/materias-vista")
    public String listarMaterias(
            @RequestParam(required = false) String profesor,
            Model model) {

        List<MateriaDTO> resultado = new ArrayList<>();

        for (MateriaDTO materia : materias) {
            if (profesor == null ||
                materia.getProfesor().equalsIgnoreCase(profesor)) {
                resultado.add(materia);
            }
        }

        model.addAttribute("materias", resultado);

        model.addAttribute("nombreProyecto", nombreProyecto);
        model.addAttribute("autor", autor);

        return "materias";
    }
    @Value("${proyecto.nombre}")
    private String nombreProyecto;

    @Value("${proyecto.autor}")
    private String autor;

    @GetMapping("/materias-vista/{indice}")
    public String detalleMateria(
            @PathVariable int indice,
            Model model) {

        if (indice < 0 || indice >= materias.size()) {
            return "redirect:/materias-vista";
        }

        model.addAttribute("materia", materias.get(indice));

        return "detalle_materia";
    }
    
    @GetMapping("/nueva-materia")
    public String mostrarFormulario(Model model) {

        model.addAttribute("materia", new MateriaDTO());

        return "formulario_materia";
    }

    @PostMapping("/guardar-materia")
    public String guardarMateria(
            @ModelAttribute MateriaDTO materia) {

        materias.add(materia);

        return "redirect:/materias-vista";
    }

}
