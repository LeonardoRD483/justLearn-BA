package com.example.justlean.service.ServiceImpl;

import com.example.justlean.model.Users;
import com.example.justlean.repository.UserRepository;
import com.example.justlean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Users> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Users> findBy(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    @Transactional
    public Users save(Users users) {
        return userRepository.save(users);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Users login(String userName, String password) {
        Users users = userRepository.findByUserNameAndAndPassword(userName, password);
        return users;
    }
}
