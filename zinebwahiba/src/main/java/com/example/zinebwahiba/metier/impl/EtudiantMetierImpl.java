package com.example.zinebwahiba.metier.impl;

import com.example.zinebwahiba.dao.EtudiantInt;
import com.example.zinebwahiba.dao.professeurInt;
import com.example.zinebwahiba.entity.Etudiant;
import com.example.zinebwahiba.entity.Professeur;
import com.example.zinebwahiba.metier.EtudiantMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantMetierImpl implements EtudiantMetier {
    @Autowired
    private EtudiantInt etudiantInt;

    public EtudiantMetierImpl(EtudiantInt etudiantInt) {
        this.etudiantInt = etudiantInt;
    }

    @Override
    public List<Etudiant> getAll() {
        return etudiantInt.findAll();
    }
}
