package com.example.demo.domain;

import org.springframework.modulith.Modulith;
import org.springframework.stereotype.Repository;

@Modulith(systemName = "repo", sharedModules = {"core"})
@Repository
public class UserRepository {
    public String getFromRepo() {
        return "Hello";
    }
}
