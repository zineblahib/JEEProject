package com.example.zinebwahiba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
@Data

@AllArgsConstructor
public class Filiere implements Serializable {
    @Id @GeneratedValue
    private int code_filiere;
    private String nom_filiere;


    @OneToMany(mappedBy="filiere")
    private Collection<Etudiant> etudiants;





    @OneToMany(mappedBy="filiere")
    private Collection<Module> modules;





    @OneToMany(mappedBy="filiere")
    private Collection<Professeur> professeurs;


    public Filiere() {
        super();
    }
}
