package com.example.justlean.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@RequiredArgsConstructor
public class Historial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int puntos;
    String dateActual;
    int nivel;
    @ManyToOne
    Alumnos alumnos;
}
