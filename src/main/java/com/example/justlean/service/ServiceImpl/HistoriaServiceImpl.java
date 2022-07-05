package com.example.justlean.service.ServiceImpl;

import com.example.justlean.dto.DashBoardDto;
import com.example.justlean.model.Historial;
import com.example.justlean.repository.HistorialRepository;
import com.example.justlean.service.HistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoriaServiceImpl implements HistorialService {

    @Autowired
    HistorialRepository historialRepository;

    @Override
    public List<Historial> findAll() {
        return historialRepository.findAll();
    }

    @Override
    public Page<Historial> findAll(Pageable pageable) {
        return historialRepository.findAll(pageable);
    }

    @Override
    public Optional<Historial> findBy(Integer id) {
        return historialRepository.findById(id);
    }

    @Override
    public Historial save(Historial his) {
        return historialRepository.save(his);
    }

    @Override
    public void delete(Integer id) {
        historialRepository.deleteById(id);
    }

    @Override
    public List<Object> dashBoard(Integer id) {
        return historialRepository.findDashboard(id);
    }
}
