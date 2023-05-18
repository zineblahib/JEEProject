package com.example.zinebwahiba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Modalite implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private float P_CC;
    private float P_TP;
    private float P_Projet;

    @OneToOne
    @JoinColumn(name="code_element")
    private Element element;


}
