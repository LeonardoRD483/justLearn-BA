package com.example.justlean.dto;

import lombok.Data;

@Data
public class DashBoardDto {

    String materia;
    int nivel;
    int puntos;

    public DashBoardDto(String materia, int nivel, int puntos) {
        this.materia = materia;
        this.nivel = nivel;
        this.puntos = puntos;
    }
}
