package com.example.justlean.controller;

import com.example.justlean.model.Niveles;
import com.example.justlean.service.ServiceImpl.UpdateNivelService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nivel")
@CrossOrigin("*")
public class NivelesController {

    private final UpdateNivelService updateNivelService;

    public NivelesController(UpdateNivelService updateNivelService) {
        this.updateNivelService = updateNivelService;
    }

    @PutMapping
    public Object updatePuntos(@RequestBody Niveles puntos) {
        Niveles puntosUp = updateNivelService.save(puntos);
        return puntosUp;
    }
}
