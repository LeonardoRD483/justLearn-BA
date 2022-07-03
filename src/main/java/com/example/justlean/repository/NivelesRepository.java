package com.example.justlean.repository;

import com.example.justlean.model.Niveles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelesRepository extends JpaRepository<Niveles, Integer> {
}
