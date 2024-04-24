package com.jwt.jwtexample.controller;

import com.jwt.jwtexample.models.Userr;
import com.jwt.jwtexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")

public class HomeController {
    @Autowired
    private UserService userService;
    //localhost:8081/home/users
    @GetMapping("/users")
    public List<Userr> getUser(){
        System.out.println("getting users");
        return userService.getUsers();
    }

}
