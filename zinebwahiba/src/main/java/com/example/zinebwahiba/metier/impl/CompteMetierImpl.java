package com.example.zinebwahiba.metier.impl;
import com.example.zinebwahiba.dao.CompteInt;
import com.example.zinebwahiba.entity.Compte;
import com.example.zinebwahiba.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CompteMetierImpl implements CompteMetier {
    @Autowired
    private CompteInt compteInt;

    public CompteMetierImpl(CompteInt compteInt) {
        this.compteInt = compteInt;
    }

    @Override
    public List<Compte> getAll() {
        return compteInt.findAll();
    }


    @Override
    public Compte save(Compte compte) {
        Compte compte1 = new Compte(compte.getEmail(),new BCryptPasswordEncoder().encode(compte.getMdp()));
        return compteInt.save(compte1);
    }
}
