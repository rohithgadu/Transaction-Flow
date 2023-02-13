package com.miniproject.transactionflow.service;

import com.miniproject.transactionflow.dto.UserDTO;
import com.miniproject.transactionflow.model.User;

public interface UserService{

    public UserDTO saveUser(UserDTO userDTO);
}
