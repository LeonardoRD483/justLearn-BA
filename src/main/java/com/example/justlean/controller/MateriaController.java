package com.example.justlean.controller;

import com.example.justlean.model.Materia;
import com.example.justlean.service.ServiceImpl.NivelesServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/materia")
@CrossOrigin("*")
public class MateriaController {

    private final NivelesServiceImpl userService;

    public MateriaController(NivelesServiceImpl userService) {
        this.userService = userService;
    }


    @PostMapping
    public Object createUserMaestro(@RequestBody ArrayList<Materia> niveles) {
        userService.generatedNotaAndSaveMateria(niveles);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
