package com.miniproject.transactionflow.service;

import com.miniproject.transactionflow.dto.UserDTO;
import com.miniproject.transactionflow.model.User;
import com.miniproject.transactionflow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user=new User();
        user.setUserName(userDTO.getUserName());
        user.setMobileNumber(userDTO.getMobileNumber());
        user.setCreditLimit(50000.00);
        user.setLastFourDigitsOfPan(1234L);
        user.setLenderId(Arrays.asList(1,2,3));
        userRepository.save(user);
        return userDTO;
    }
}
