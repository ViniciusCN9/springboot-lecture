package com.university.lecture.application.interfaces;

import com.university.lecture.application.dtos.LoginDTO;
import com.university.lecture.application.dtos.RegisterDTO;

public interface UserService {

    public String login(LoginDTO request);

    public String register(RegisterDTO request);
    
}
