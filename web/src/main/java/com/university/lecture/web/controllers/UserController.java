package com.university.lecture.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.university.lecture.application.dtos.UserLoginDTO;
import com.university.lecture.application.dtos.UserRegisterDTO;
import com.university.lecture.application.interfaces.IUserService;

@Controller
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private IUserService userService;
    
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginDTO request) {
        String response = this.userService.login(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserRegisterDTO request) {
        String response = this.userService.register(request);
        return ResponseEntity.ok(response);
    }

}
