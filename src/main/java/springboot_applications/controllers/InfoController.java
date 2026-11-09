package springboot_applications.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class InfoController {
    @GetMapping("/proyecto")
    public String proyecto() {
        return "Proyecto: springboot-applications - Nadya";
    }
    @GetMapping("/numero")
    public int numero() {
        return 42;
    }
}