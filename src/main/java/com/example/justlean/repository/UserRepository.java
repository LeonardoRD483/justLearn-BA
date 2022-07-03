package com.example.justlean.repository;

import com.example.justlean.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    public Users findByUserNameAndAndPassword(String userName, String password);
}
