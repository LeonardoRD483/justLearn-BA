package com.example.justlean.service.ServiceImpl;

import com.example.justlean.model.Puntos;
import com.example.justlean.repository.PuntosRepository;
import com.example.justlean.service.PuntosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuntosServiceImpl implements PuntosService {
    @Autowired
    private PuntosRepository puntosRepository;

    @Override
    public List<Puntos> findAll() {
        return puntosRepository.findAll();
    }

    @Override
    public Page<Puntos> findAll(Pageable pageable) {
        return puntosRepository.findAll(pageable);
    }

    @Override
    public Optional<Puntos> findBy(Integer id) {
        return puntosRepository.findById(id);
    }

    @Override
    public Puntos save(Puntos puntos) {
        return puntosRepository.save(puntos);
    }

    @Override
    public void delete(Integer id) {
        puntosRepository.deleteById(id);

    }

    @Override
    public Puntos findBy(int id) {
        return puntosRepository.findById(id);
    }

    @Override
    public Puntos findByAlumno(int alumno_id, int materia_id) {
        return puntosRepository.findByAlumnos_IdAndMateria_Id(alumno_id, materia_id);
    }

}
