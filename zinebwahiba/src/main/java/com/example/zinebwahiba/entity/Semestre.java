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
public class Semestre implements Serializable {
    @Id
    private int id;
    private  nom_semestre nom_semestre;


    @OneToMany(mappedBy ="semestre")
    private Collection<Module> modules;



}
