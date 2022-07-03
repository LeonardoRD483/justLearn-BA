package com.example.justlean.service;


import com.example.justlean.model.Materia;

import java.util.ArrayList;

@FunctionalInterface
public interface NivelesByMateria {


    ArrayList<Materia> nivelesByMateria(ArrayList<Materia> niveles);

    static int generatedLevel(int nota) {
        if (nota > 0 && nota <= 50) {
            return 1;
        }
        if (nota > 50 && nota <= 74) {
            return 2;
        }
        if (nota > 74 && nota <= 100) {
            return 3;
        }
        return 4;
    }
}
