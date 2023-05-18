package com.example.zinebwahiba.controller;

import com.example.zinebwahiba.metier.ElementMetier;
import com.example.zinebwahiba.metier.EtudiantMetier;
import com.example.zinebwahiba.metier.ProfesseurMetier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EtudiantController {
    private EtudiantMetier etudiantMetier;
    public EtudiantController(EtudiantMetier etudiantMetier) {this.etudiantMetier = etudiantMetier;}

    @GetMapping("/etudiants")
    public String listElement(Model model) {

        model.addAttribute("listeetudiant", etudiantMetier.getAll());
        return "etudiant";

    }
}
