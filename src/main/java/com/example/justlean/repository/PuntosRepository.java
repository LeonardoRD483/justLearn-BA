package com.example.justlean.repository;

import com.example.justlean.model.Puntos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntosRepository extends JpaRepository<Puntos, Integer> {

    Puntos findById(int id);

    Puntos findByAlumnos_IdAndMateria_Id(int alumnos_id,int materia_id);
}
