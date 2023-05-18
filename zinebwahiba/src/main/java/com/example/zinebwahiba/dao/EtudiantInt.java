package com.example.zinebwahiba.dao;


import com.example.zinebwahiba.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantInt  extends JpaRepository<Etudiant, Integer> {
}
