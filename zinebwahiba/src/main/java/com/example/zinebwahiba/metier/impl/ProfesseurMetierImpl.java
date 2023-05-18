package com.example.zinebwahiba.metier.impl;

import com.example.zinebwahiba.dao.professeurInt;
import com.example.zinebwahiba.entity.Professeur;
import com.example.zinebwahiba.metier.ProfesseurMetier;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service

    public class ProfesseurMetierImpl implements ProfesseurMetier {
        private professeurInt ProfesseurInt;

        public ProfesseurMetierImpl(professeurInt ProfesseurInt) {
            this.ProfesseurInt = ProfesseurInt;
        }

        @Override
        public List<Professeur> getAll() {
            return ProfesseurInt.findAll();
        }

        @Override
        public Professeur getByCode(int code) {
            return ProfesseurInt.findById(code).get();
        }


    }
