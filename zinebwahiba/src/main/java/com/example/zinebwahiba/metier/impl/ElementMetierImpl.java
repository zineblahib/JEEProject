package com.example.zinebwahiba.metier.impl;

import com.example.zinebwahiba.dao.elementInt;
import com.example.zinebwahiba.dao.professeurInt;
import com.example.zinebwahiba.entity.Element;
import com.example.zinebwahiba.entity.Professeur;
import com.example.zinebwahiba.metier.ElementMetier;
import com.example.zinebwahiba.metier.ProfesseurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

    public class   ElementMetierImpl implements ElementMetier {
    @Autowired
        private elementInt ElementInt;

        public ElementMetierImpl (elementInt ElementInt) {
            this. ElementInt =  ElementInt;
        }

        @Override
        public List<Element> getAll() {
            return ElementInt.findAll();
        }
}
