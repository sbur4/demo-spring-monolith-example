package com.example.demo.core;

import org.springframework.modulith.ApplicationModule;

@ApplicationModule(displayName = "service", allowedDependencies = {"web"})
public interface UserService {
    String getFromService();
}
