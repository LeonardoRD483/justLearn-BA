package com.example.justlean.controller;

import com.example.justlean.model.Puntos;
import com.example.justlean.model.Users;
import com.example.justlean.service.ServiceImpl.PuntosServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/puntos")
@CrossOrigin("*")
public class PuntosController {

    private final PuntosServiceImpl puntosService;


    public PuntosController(PuntosServiceImpl puntosService) {
        this.puntosService = puntosService;
    }

    @PostMapping
    public Object createPuntos(@RequestBody Puntos users) {
        Puntos usersCreate = puntosService.save(users);
        if (null != usersCreate) {
            return new ResponseEntity<>(usersCreate, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("historial no creado correctamente", HttpStatus.BAD_GATEWAY);
        }
    }

    @PutMapping
    public Object updatePuntos(@RequestBody Puntos puntos) {
        Puntos puntosUp = puntosService.save(puntos);
        return puntosUp;
    }

    @GetMapping(value = "/puntosByAlumno/{alumno_id}/{materia_id}")
    public Object loginUser(@PathVariable("alumno_id") int alumno_id, @PathVariable("materia_id") int materia_id) {
        Puntos users = puntosService.findByAlumno(alumno_id, materia_id);
        if (null != users) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Contraseña/UserName Incorrecto", HttpStatus.BAD_GATEWAY);

        }
    }


}
