package com.example.justlean.controller;

import com.example.justlean.model.Alumnos;
import com.example.justlean.model.Users;
import com.example.justlean.service.ServiceImpl.AlumnoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumno")
@CrossOrigin("*")
public class AlumnoController {

    private final AlumnoServiceImpl userService;

    public AlumnoController(AlumnoServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public Object createUserMaestro(@RequestBody Alumnos users) {
        Alumnos usersCreate = userService.save(users);
        if (null != usersCreate) {
            return new ResponseEntity<>(usersCreate, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("user no creado correctamente", HttpStatus.BAD_GATEWAY);
        }
    }

    @GetMapping(value = "/byMaestro/{id}")
    public Object loginUser(@PathVariable("id") int maestro_id) {
        List<Alumnos> users = userService.getByMaestro(maestro_id);
        if (null != users) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Contraseña/UserName Incorrecto", HttpStatus.BAD_GATEWAY);

        }
    }


    @GetMapping(value = "/login/{userName}/{password}")
    public Object loginUser(@PathVariable("userName") String userName, @PathVariable("password") String password) {
        Alumnos users = userService.login(userName, password);
        if (null != users) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Contraseña/UserName Incorrecto", HttpStatus.BAD_GATEWAY);
        }
    }


}
