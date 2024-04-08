package com.api.requiredremainder.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.requiredremainder.model.User;

@RestController
@CrossOrigin
public interface UserController {

    @PostMapping("/login")
    public boolean login(@RequestBody User user);

}
