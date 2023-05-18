package com.example.zinebwahiba.controller;

import com.example.zinebwahiba.dao.professeurInt;
import com.example.zinebwahiba.entity.Compte;
import com.example.zinebwahiba.entity.Professeur;
import com.example.zinebwahiba.metier.CompteMetier;
import com.example.zinebwahiba.metier.ElementMetier;
import com.example.zinebwahiba.metier.ProfesseurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.management.openmbean.CompositeData;

@Controller
public class CompteController {
    @Autowired
    private CompteMetier compteMetier;
    @Autowired
    private ProfesseurMetier professeurMetier;
    public CompteController(CompteMetier compteMetier) {this.compteMetier = compteMetier;}


    @GetMapping("/affectation")
    public String formulaireCreation(Model model){
        Compte compte = new Compte();
        model.addAttribute("compte",compte);
        model.addAttribute("profss", professeurMetier.getAll());
        return "Affectations";
    }


    @PostMapping("/Comptes")
    public String creationCompte(@ModelAttribute("compte") Compte compte, Model model){
        Compte comp = new Compte();
        comp = compte;
        int code = compte.getProfesseur().getCode();
        Professeur professeur = professeurMetier.getByCode(code);
        comp.setProfesseur(professeur);
        compteMetier.save(comp);
        model.addAttribute("listComptes",compteMetier.getAll());
        return "Comptes";
    }












    @GetMapping("/Af")
    public String listCompte(Model model) {

        model.addAttribute("listeCompte", compteMetier.getAll());
        return "Affectations";

    }

}
