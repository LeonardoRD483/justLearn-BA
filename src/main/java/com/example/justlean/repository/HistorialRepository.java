package com.example.justlean.repository;

import com.example.justlean.dto.DashBoardDto;
import com.example.justlean.model.Alumnos;
import com.example.justlean.model.Historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HistorialRepository extends JpaRepository<Historial, Integer> {

    @Query("SELECT u FROM Alumnos u WHERE u.maestro_id = ?1")
    List<Alumnos> findByMaestro_id(Integer name);

    @Query(value = "select M.materia, N.nivel, S.puntos from alumnos A join materia M on A.id = M.alumno_id join puntos S on S.materia_id = M.id join niveles N on N.materia_id = M.id  where ?1 = A.id", nativeQuery = true)
    List<Object> findDashboard(Integer id);

}
