package com.example.afternoon.Resource;

import com.example.afternoon.Entity.User;
import com.example.afternoon.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee-mgt")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String getUsers(){
        User user = userService.create("Java","DoB");
        return "Name: "+user.getUserName()+" "+"DoB: "+user.getUserDoB();
    }
}
