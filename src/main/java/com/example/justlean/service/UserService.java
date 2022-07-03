package com.example.justlean.service;

import com.example.justlean.model.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<Users> findAll();
    public Page<Users> findAll(Pageable pageable);
    public Optional<Users> findBy(Integer id);
    public Users save(Users Users);
    public void delete(Integer id);
    public Users login(String userName, String password);

}
