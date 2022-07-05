package com.example.justlean.service.ServiceImpl;


import com.example.justlean.model.Materia;
import com.example.justlean.model.Niveles;
import com.example.justlean.repository.MateriaRepository;
import com.example.justlean.repository.NivelesRepository;
import com.example.justlean.service.NivelesByMateria;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NivelesServiceImpl {

    @Autowired
    MateriaRepository userRepository;

    @Autowired
    NivelesRepository nivelesRepository;

    public NivelesServiceImpl() {

    }

    NivelesByMateria materia = (niveles) -> {
        List<Materia> materias = this.userRepository.saveAll(niveles);
        return (ArrayList<Materia>) materias;
    };

    public String generatedNotaAndSaveMateria(ArrayList<Materia> materiaArrayList) {
        try {
            ArrayList<Materia> levelMateria = materia.nivelesByMateria(materiaArrayList);
            levelMateria.forEach((materia1 -> {
                Niveles niveles = new Niveles();
                int nivel = NivelesByMateria.generatedLevel(materia1.getNota());
                niveles.setNivel(nivel);
                niveles.setMateria_id(materia1.getId());
                nivelesRepository.save(niveles);
            }));
            return "success";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
