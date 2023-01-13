package com.example.afternoon.ServiceImp;

import com.example.afternoon.Entity.User;
import com.example.afternoon.Repository.UserRepository;
import com.example.afternoon.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(String userName, String userDoB) {
        User user = new User();
        user.setId(1000L);
        user.setUserName(userName);
        user.setUserDoB(userDoB);
        return userRepository.save(user);
    }
}
