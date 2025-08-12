package com.studyon.controller;

import com.studyon.entitiy.User;
import com.studyon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class eee {

    private final UserService userService;

    //자동
    @Autowired
    public eee(UserService userService) {
        this.userService = userService;
    }


    // POST /users/registe
    @PostMapping("/register/spending")
    public User registerUser(@RequestParam String name, @RequestParam String email) {
        return userService.registerUser(name, email);
    }
}
