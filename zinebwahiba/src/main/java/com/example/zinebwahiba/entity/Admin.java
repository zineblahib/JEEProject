package com.example.zinebwahiba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data

@AllArgsConstructor
public class Admin {
    @Id @GeneratedValue
    private int id;
    private String nom_admin;
    private String prenom_admin;

    @OneToOne(mappedBy="admin")
    private Compte utilisateur;


    public Admin() {
        super();

    }

}
