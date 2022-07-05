package com.example.justlean.repository;

import com.example.justlean.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {

    @Query(value = "select M.id as id_materia, N.id as id_nivel, M.materia, N.nivel, S.puntos from alumnos A join materia M on A.id = M.alumno_id join puntos S on S.materia_id = M.id join niveles N on N.materia_id = M.id  where ?1 = A.id", nativeQuery = true)
    List<Object> findMateria(Integer id);
}
