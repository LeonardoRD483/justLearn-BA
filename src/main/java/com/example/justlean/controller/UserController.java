package com.example.justlean.controller;

import com.example.justlean.model.Users;
import com.example.justlean.service.ServiceImpl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public Object getAllClient() {
        List<Users> list = userService.findAll();
        try {
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.BAD_GATEWAY);
        }
    }

    @GetMapping(value = "/login/{userName}/{password}")
    public Object loginUser(@PathVariable("userName") String userName, @PathVariable("password") String password) {
        Users users = userService.login(userName, password);
        if (null != users) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Contraseña/UserName Incorrecto", HttpStatus.BAD_GATEWAY);

        }
    }

    @PostMapping
    public Object createUserMaestro(@RequestBody Users users) {
        Users usersCreate = userService.save(users);
        if (null != usersCreate) {
            return new ResponseEntity<>(usersCreate, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("user no creado correctamente", HttpStatus.BAD_GATEWAY);
        }
    }



}
