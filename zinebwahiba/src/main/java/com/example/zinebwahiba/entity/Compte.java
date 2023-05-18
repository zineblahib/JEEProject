package com.example.zinebwahiba.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String mdp;

    @OneToOne
    @JoinColumn(name = "id_admin")
    private Admin admin;


    @OneToOne
    @JoinColumn(name = "code_professeur")
    private Professeur professeur;


    public Compte( String email, String mdp) {
        this.email = email;
        this.mdp = mdp;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public String getMdp() {
        return mdp;
    }
}

