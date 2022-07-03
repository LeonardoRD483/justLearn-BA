package com.example.justlean.repository;

import com.example.justlean.model.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepostory extends JpaRepository<Alumnos, Integer> {
    public Alumnos findByUserNameAndAndPassword(String userName, String password);


    @Query("SELECT u FROM Alumnos u WHERE u.maestro_id = ?1")
   List<Alumnos>  findByMaestro_id(Integer name);
}
