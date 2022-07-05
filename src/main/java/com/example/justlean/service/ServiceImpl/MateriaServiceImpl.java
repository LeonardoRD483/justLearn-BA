package com.example.justlean.service.ServiceImpl;

import com.example.justlean.model.Niveles;
import com.example.justlean.repository.MateriaRepository;
import com.example.justlean.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    MateriaRepository materiaRepository;

    @Override
    public List<Niveles> findAll() {
        return null;
    }

    @Override
    public Page<Niveles> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Niveles> findBy(Integer id) {
        return Optional.empty();
    }

    @Override
    public Niveles save(Niveles Users) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Object> findByMateria(Integer id) {
        return materiaRepository.findMateria(id);
    }
}
