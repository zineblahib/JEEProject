package com.example.zinebwahiba;


import com.example.zinebwahiba.dao.*;
import com.example.zinebwahiba.entity.Professeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ZinebwahibaApplication implements CommandLineRunner {
    @Autowired
    private professeurInt ProfesseurInt;
    private CompteInt compteInt;
    private elementInt ElementInt;
    private EtudiantInt etudiantInt;
    private filiereInt FiliereInt;
    private module Module;
    private noteInt NoteInt;
    private semaestreint SemaestreInt;
    private adminInt AdminInt;

    public static void main(String[] args) {
        SpringApplication.run(ZinebwahibaApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {



    }
}
