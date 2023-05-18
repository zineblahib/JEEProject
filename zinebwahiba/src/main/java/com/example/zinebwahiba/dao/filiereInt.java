package com.example.zinebwahiba.dao;


import com.example.zinebwahiba.entity.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface filiereInt  extends JpaRepository<Filiere, Integer>{
}
