package com.example.afternoon.serviceImp;

import com.example.afternoon.entity.User;
import com.example.afternoon.repository.UserRepository;
import com.example.afternoon.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(String userName, String userDoB) {
        User user = new User();
        user.setUserName(userName);
        user.setUserDoB(userDoB);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
