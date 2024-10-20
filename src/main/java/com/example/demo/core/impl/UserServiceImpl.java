package com.example.demo.core.impl;

import com.example.demo.core.UserService;
import com.example.demo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.Modulith;
import org.springframework.stereotype.Service;

@Modulith(systemName = "user_service", sharedModules = {"web"})
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public String getFromService() {
        return userRepository.getFromRepo();
    }
}