package com.example.zinebwahiba.controller;

import com.example.zinebwahiba.metier.EtudiantMetier;
import com.example.zinebwahiba.metier.ProfesseurMetier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ProfesseurController {
    private ProfesseurMetier professeurMetier;

    public ProfesseurController(ProfesseurMetier professeurMetier) {
        this.professeurMetier = professeurMetier;
    }

    @RequestMapping("/")
    public String home(Model model) {
        return "login";

    }

    @GetMapping("/professeurs")
    public String listProfesseur(Model model) {

        model.addAttribute("listProfs", professeurMetier.getAll());
        return "professeurlist";
    }

    @RequestMapping("/element")
    public String element(Model model) {
        return "elements";

    }

    @RequestMapping("/fo")
    public String filiere(Model model) {
        return "filieres";

    }

    @RequestMapping("/module")
    public String module(Model model) {
        return "modules";

    }




    @RequestMapping("/etudiants")
    public String etudiant(Model model) {
        return "etudiant";
    }



    @RequestMapping("/AAA")
    public String affection(Model model) {
        return "Affectations";

    }
}
