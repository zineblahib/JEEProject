package com.example.zinebwahiba.controller;

import com.example.zinebwahiba.metier.ElementMetier;
import com.example.zinebwahiba.metier.ModuleMetier;
import com.example.zinebwahiba.metier.ProfesseurMetier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModuleController {

    private ModuleMetier moduleMetier;
    public ModuleController(ModuleMetier moduleMetier) {
        this.moduleMetier = moduleMetier;
    }

    @GetMapping("/module")
    public String listmodul(Model model) {

        model.addAttribute("listemodule", moduleMetier.getAll());
        return "modules";
    }


}
