package com.example.justlean.service.ServiceImpl;

import com.example.justlean.model.Alumnos;
import com.example.justlean.repository.AlumnoRepostory;
import com.example.justlean.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoRepostory userRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Alumnos> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Alumnos> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Alumnos> findBy(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    @Transactional
    public Alumnos save(Alumnos users) {
        return userRepository.save(users);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Alumnos login(String userName, String password) {
        return userRepository.findByUserNameAndAndPassword(userName, password);
    }

    @Override
    public List<Alumnos> getByMaestro(int maestro_id) {
        return userRepository.findByMaestro_id(maestro_id);
    }
}
