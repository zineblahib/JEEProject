package com.example.zinebwahiba.metier.impl;

import com.example.zinebwahiba.dao.elementInt;
import com.example.zinebwahiba.dao.filiereInt;
import com.example.zinebwahiba.entity.Element;
import com.example.zinebwahiba.entity.Filiere;
import com.example.zinebwahiba.metier.ElementMetier;
import com.example.zinebwahiba.metier.FiliereMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiliereMetierImpl implements FiliereMetier{
    @Autowired
    private filiereInt FiliereInt;

    public FiliereMetierImpl (filiereInt FilieretInt) {
        this.FiliereInt =  FiliereInt;
    }
    @Override
    public List<Filiere> getAll() {
        return FiliereInt.findAll();
    }
}


