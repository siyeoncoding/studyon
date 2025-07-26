package com.studyon.controller;

import com.studyon.entitiy.User;

import com.studyon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    // POST /users/register
    @PostMapping("/register")
    public User registerUser(@RequestParam String name, @RequestParam String email) {
        return userService.registerUser(name, email);
    }
}
