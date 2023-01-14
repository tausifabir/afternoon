package com.example.afternoon.serviceImp;

import com.example.afternoon.entity.Team;
import com.example.afternoon.entity.User;
import com.example.afternoon.repository.TeamRepository;
import com.example.afternoon.repository.UserRepository;
import com.example.afternoon.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final TeamRepository teamRepository;

    public UserServiceImpl(UserRepository userRepository, TeamRepository teamRepository) {
        this.userRepository = userRepository;
        this.teamRepository = teamRepository;
    }

    @Override
    public User create() {
        User user = new User();
        user.setUserName("Java User");
        user.setPin("1001");
        user.setPhone("01234567890");
        user.setEmail("1234@email.com");
        user.setDepartment("Software");
        user.setPass("1234");
        user.setAdmin(true);
        user.setManager(true);
        user.setJoiningDate(new Date());
        user.setCreatedAt(new Date());
        /*List<Team> teams = teamRepository.findAll();
        user.setTeam(teams.get(0));*/
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
