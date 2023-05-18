package com.example.zinebwahiba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Module implements Serializable {
    @Id
    @GeneratedValue
    private int code;
    private String nom_module;



    @ManyToMany(mappedBy="Modules")
    private Collection<Etudiant> etudiants;



    @OneToMany(mappedBy="module")
    private Collection<Element> elements;


    @ManyToOne
    @JoinColumn(name="code_seme")
    private Semestre semestre;


    @ManyToOne
    @JoinColumn(name="code_filere")
    private Filiere filiere;

}
