package mision.agro.mision_agro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MisionAgroController {

    @GetMapping(value = { "/index"})
    public String goToIndex(Model model) {
        model.addAttribute("page", "home");
        return "index";
    }

    @GetMapping("/frutas")
    public String goTofrutas(Model model) {
        return "frutas";    
    }

    @GetMapping("/granos")
    public String goTogranos(Model model) {
        return "granos";    
    }

    @GetMapping("/lacteos")
    public String goTolacteos(Model model) {
        return "lacteos";    
    }

    @GetMapping("/verduras")
    public String goToverduras(Model model) {
        return "verduras";    
    }

    @GetMapping("/proteinas")
    public String goToproteinas(Model model) {
        return "proteinas";    
    }

    @GetMapping("/otros")
    public String goTootros(Model model) {
        return "otros";    
    }

    @GetMapping("/login")
    public String goTologin(Model model) {
        return "login";    
    }

    @GetMapping("/registro")
    public String goToregistro(Model model) {
        return "registro";    
    }

    @GetMapping("/politica-privacidad")
    public String goTopoliticaprivacidad(Model model) {
        return "politica-privacidad";    
    }

    @GetMapping("/terminos-condiciones")
    public String goToterminoscondiciones(Model model) {
        return "terminos-condiciones";    
    }

    @GetMapping("/trata-datos")
    public String goTotratadatos(Model model) {
        return "trata-datos";    
    }

    @GetMapping("/publicaciones")
    public String goTopublicaciones(Model model) {
        return "publicaciones";    
    }
}