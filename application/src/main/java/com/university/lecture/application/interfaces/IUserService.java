package com.university.lecture.application.interfaces;

import com.university.lecture.application.dtos.UserLoginDTO;
import com.university.lecture.application.dtos.UserRegisterDTO;

public interface IUserService {

    public String login(UserLoginDTO request);

    public String register(UserRegisterDTO request);
    
}
