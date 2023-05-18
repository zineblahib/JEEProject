package com.example.zinebwahiba.metier;

import com.example.zinebwahiba.entity.Compte;
import com.example.zinebwahiba.entity.Element;

import java.util.List;

public interface CompteMetier {
    Compte save(Compte compte);
    List<Compte> getAll();

}

