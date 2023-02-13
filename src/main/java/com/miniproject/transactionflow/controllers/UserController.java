package com.miniproject.transactionflow.controllers;

import com.miniproject.transactionflow.dto.UserDTO;
import com.miniproject.transactionflow.model.User;
import com.miniproject.transactionflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/users")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }
}
