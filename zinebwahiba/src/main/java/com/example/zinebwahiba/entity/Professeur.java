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
public class Professeur implements Serializable {
    @Id
    @GeneratedValue
    private int code;
    private String nom;
    private String prenom;
    private String specialite;


    @OneToOne(mappedBy="professeur")
    private Compte utilisateur;

    @OneToMany(mappedBy="prof")
    private Collection<Element> elements;
    @ManyToMany(mappedBy="professeurs")
    private Collection<Etudiant> etudiants;
    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "filiere_professeur",
            joinColumns = @JoinColumn(name = "code_filiere"),
            inverseJoinColumns = @JoinColumn(name = "code_professeur")
    )
    private Filiere filiere;

    public Professeur() {
        super();
    }

    public Professeur(int code, String nom, String prenom, String specialite) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
    }

    public int getCode() {
        return code;
    }
}
