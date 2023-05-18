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
public class Element implements Serializable {
    @Id
    @GeneratedValue
    private int code;
    private String nom_element;


    @ManyToOne
    @JoinColumn(name="code_module")
    private Module module;

    @OneToOne
    @JoinColumn(name="code_note")
    private Note note;


    @ManyToOne
    @JoinColumn(name="code_prof")
    private Professeur prof;

    @OneToOne(mappedBy="element")
    private Modalite modalite;



}
