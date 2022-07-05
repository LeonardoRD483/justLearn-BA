package com.example.justlean.service;

import com.example.justlean.model.Niveles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface MateriaService {

    public List<Niveles> findAll();
    public Page<Niveles> findAll(Pageable pageable);
    public Optional<Niveles> findBy(Integer id);
    public Niveles save(Niveles Users);
    public void delete(Integer id);
    public List<Object> findByMateria(Integer id);
}
