package com.example.justlean.controller;

import com.example.justlean.dto.DashBoardDto;
import com.example.justlean.model.Historial;
import com.example.justlean.service.ServiceImpl.HistoriaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("/dashBoard/{id}")
    public Object createDashBoard(@PathVariable("id") int id_alumno) {
        List<Object> usersCreate = historiaService.dashBoard(id_alumno);
        if (null != usersCreate) {
            return new ResponseEntity<>(usersCreate, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("historial no creado correctamente", HttpStatus.BAD_GATEWAY);
        }
    }
}
