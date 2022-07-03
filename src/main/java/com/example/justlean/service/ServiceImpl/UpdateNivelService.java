package com.example.justlean.service.ServiceImpl;

import com.example.justlean.model.Niveles;
import com.example.justlean.repository.NivelesRepository;
import com.example.justlean.service.NivelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UpdateNivelService implements NivelesService {

    @Autowired
    NivelesRepository nivelesRepository;

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
    public Niveles save(Niveles niveles) {
        return nivelesRepository.save(niveles);
    }

    @Override
    public void delete(Integer id) {

    }
}
