package com.ddubuck.service;

import com.ddubuck.common.domain.User;
import com.ddubuck.common.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

     public void joinUser(User user){
        userRepository.save(user);
     }
}
