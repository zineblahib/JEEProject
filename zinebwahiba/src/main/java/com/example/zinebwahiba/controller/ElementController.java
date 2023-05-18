package com.example.zinebwahiba.controller;

import com.example.zinebwahiba.metier.ElementMetier;
import com.example.zinebwahiba.metier.ProfesseurMetier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ElementController {
    private ElementMetier elementMetier;
    public ElementController(ElementMetier elementMetier) {this.elementMetier = elementMetier;}

    @GetMapping("/element")
    public String listElement(Model model) {

        model.addAttribute("listelement", elementMetier.getAll());
        return "elements";

    }
}
