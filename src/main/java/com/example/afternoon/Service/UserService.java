package com.example.afternoon.Service;

import com.example.afternoon.Entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    public User create(String userName, String userDoB);
}
