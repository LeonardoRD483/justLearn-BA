package com.example.justlean.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@RequiredArgsConstructor
public class Puntos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int puntos;

    @ManyToOne
    Materia materia;
    @ManyToOne
    Niveles niveles;
    @ManyToOne
    Alumnos alumnos;
}
