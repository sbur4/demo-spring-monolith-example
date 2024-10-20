package com.example.demo.web;

import com.example.demo.core.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.modulith.Modulithic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Modulithic(systemName = "web", sharedModules = {"core"})
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserServiceImpl useService;

    @GetMapping("/me")
    public ResponseEntity<String> getMethod() {
        return ResponseEntity.ok(useService.getFromService());
    }
}