package com.example.justlean.service;

import com.example.justlean.model.Historial;
import com.example.justlean.model.Niveles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface HistorialService {

    public List<Historial> findAll();
    public Page<Historial> findAll(Pageable pageable);
    public Optional<Historial> findBy(Integer id);
    public Historial save(Historial Users);
    public void delete(Integer id);
    public Object dashBoard(Integer id);

}
