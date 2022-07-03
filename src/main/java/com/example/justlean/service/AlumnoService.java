package com.example.justlean.service;

import com.example.justlean.model.Alumnos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface AlumnoService {

    public List<Alumnos> findAll();
    public Page<Alumnos> findAll(Pageable pageable);
    public Optional<Alumnos> findBy(Integer id);
    public Alumnos save(Alumnos Users);
    public void delete(Integer id);
    public Alumnos login(String userName, String password);
    public List<Alumnos> getByMaestro(int maestro_id);
}
