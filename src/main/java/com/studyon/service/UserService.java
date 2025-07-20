package com.studyon.service;

import com.studyon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studyon.entitiy.User;

@Service
public class UserService {
    public final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 회원 등록 기능
    public User registerUser(String name, String email) {
        User user = new User(name, email);
        return userRepository.save(user);
    }
}
