package com.example.afternoon.service;

import com.example.afternoon.entity.User;

import java.util.List;

public interface UserService {
    public User create();
    public List<User> getAllUsers();
}
