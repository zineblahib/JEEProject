package com.example.zinebwahiba.controller;

import com.example.zinebwahiba.metier.ElementMetier;
import com.example.zinebwahiba.metier.FiliereMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FiliereController {

    @Autowired
    private FiliereMetier filiereMetier;

    public FiliereController(FiliereMetier filiereMetier) {
        this.filiereMetier = filiereMetier;
    }

    @GetMapping("/foo")
    public String listfiliere(Model model) {

        model.addAttribute("listfiliere", filiereMetier.getAll());
        return "filieres";
    }
}


