package com.example.afternoon.resource;

import com.example.afternoon.entity.User;
import com.example.afternoon.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee-mgt")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public User createUser(){
        return userService.create();
    }

    @GetMapping("/all")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }
}
