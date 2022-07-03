package com.example.justlean.service;

import com.example.justlean.model.Puntos;
import com.example.justlean.model.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PuntosService {

    public List<Puntos> findAll();
    public Page<Puntos> findAll(Pageable pageable);
    public Optional<Puntos> findBy(Integer id);
    public Puntos save(Puntos Users);
    public void delete(Integer id);
    public Puntos findBy(int id);
    public Puntos findByAlumno(int alumno_id, int materia_id);
}
