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
public class Etudiant implements Serializable {
    @Id @GeneratedValue
    private int code;
    private String cne;
    private String nom_etudiant;
    private String prenom_etudiant;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "note_etudiant",
            joinColumns = @JoinColumn(name = "code_etudiant"),
            inverseJoinColumns = @JoinColumn(name = "code_note")
    )
    private Collection<Note> notes;


    @ManyToOne
    @JoinColumn(name="code_filiere")
    private Filiere filiere;


    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "professeur_etudiant",
            joinColumns = @JoinColumn(name = "code_etudiant"),
            inverseJoinColumns = @JoinColumn(name = "code_professeur")
    )
    private Collection<Professeur> professeurs;



    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "Module_etudiant",
            joinColumns = @JoinColumn(name = "code_etudiant"),
            inverseJoinColumns = @JoinColumn(name = "code_Module")
    )
    private Collection<Module> Modules;

}
