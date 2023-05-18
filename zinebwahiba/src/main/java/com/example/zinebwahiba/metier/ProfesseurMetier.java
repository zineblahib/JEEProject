package com.example.zinebwahiba.metier;

import com.example.zinebwahiba.entity.Professeur;

import java.util.List;

public interface ProfesseurMetier {
    List<Professeur> getAll();
    Professeur getByCode(int code);

}
