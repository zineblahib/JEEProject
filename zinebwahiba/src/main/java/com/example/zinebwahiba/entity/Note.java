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
public class Note implements Serializable {
    @Id
    @GeneratedValue
    private int code;
    private float note;

    @ManyToMany(mappedBy="notes")
    private Collection<Etudiant> Etudiants;

    @OneToOne(mappedBy="note")
    private Element element;

}
