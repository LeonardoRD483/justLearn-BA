package com.example.justlean.controller;

import com.example.justlean.model.Historial;
import com.example.justlean.service.ServiceImpl.HistoriaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/historial")
@CrossOrigin("*")
public class HistorialController {

    private final HistoriaServiceImpl historiaService;

    public HistorialController(HistoriaServiceImpl historiaService) {
        this.historiaService = historiaService;
    }

    @PostMapping
    public Object createHistorial(@RequestBody Historial users) {
        Historial usersCreate = historiaService.save(users);
        if (null != usersCreate) {
            return new ResponseEntity<>(usersCreate, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("historial no creado correctamente", HttpStatus.BAD_GATEWAY);
        }
    }
}
