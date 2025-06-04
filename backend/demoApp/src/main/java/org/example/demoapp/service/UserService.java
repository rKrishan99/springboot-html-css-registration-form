package org.example.demoapp.service;

import org.example.demoapp.entity.User;
import org.example.demoapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        return userRepository.save(user);
    }

    public User authenticateUser(String email, String password){
        User user = userRepository.findById(email).orElse(null);
        if(user != null && password.equals(user.getPassword())){
            return user;
        }
        return null;
    }

    public boolean emailExists(String email) {
        return userRepository.findById(email).isPresent();
    }

}
