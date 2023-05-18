package com.example.zinebwahiba.metier.impl;

import com.example.zinebwahiba.dao.module;
import com.example.zinebwahiba.entity.Module;
import com.example.zinebwahiba.metier.ModuleMetier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class   ModuleMetierImpl implements ModuleMetier {
    private module ModuleInt;

    public ModuleMetierImpl (module ModuleInt) {
        this. ModuleInt =  ModuleInt;
    }

    @Override
    public List<Module> getAll() {
        return ModuleInt.findAll();
    }
}

