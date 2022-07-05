package com.example.justlean.controller;

import com.example.justlean.model.Materia;
import com.example.justlean.service.ServiceImpl.MateriaServiceImpl;
import com.example.justlean.service.ServiceImpl.NivelesServiceImpl;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/materia")
@CrossOrigin("*")
public class MateriaController {

    private final NivelesServiceImpl userService;
    private final MateriaServiceImpl materiaService;

    public MateriaController(NivelesServiceImpl userService, MateriaServiceImpl materiaService) {
        this.userService = userService;
        this.materiaService = materiaService;
    }


    @PostMapping
    public Object createUserMaestro(@RequestBody ArrayList<Materia> niveles) {
        userService.generatedNotaAndSaveMateria(niveles);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/byMateria/{id}")
    public Object createDashBoard(@PathVariable("id") int id_alumno) {
        List<Object> usersCreate = materiaService.findByMateria(id_alumno);
        if (null != usersCreate) {
            return new ResponseEntity<>(usersCreate, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("historial no creado correctamente", HttpStatus.BAD_GATEWAY);
        }
    }
}
