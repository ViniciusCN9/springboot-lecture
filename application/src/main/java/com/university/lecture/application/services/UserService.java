package com.university.lecture.application.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.lecture.application.dtos.UserLoginDTO;
import com.university.lecture.application.dtos.UserRegisterDTO;
import com.university.lecture.application.interfaces.IUserService;
import com.university.lecture.domain.entities.Student;
import com.university.lecture.domain.entities.User;
import com.university.lecture.domain.repositories.IStudentRepository;
import com.university.lecture.domain.repositories.IUserRepository;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IStudentRepository studentRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public String login(UserLoginDTO request) {
        User user = this.userRepository.findByUsernameAndPassword(request.username, request.password);
        return "token " + user.getUsername();
    }

    @Override
    public String register(UserRegisterDTO request) {
        boolean existsUsername = this.userRepository.existsByUsername(request.username);
        boolean existsEmail = this.userRepository.existsByEmail(request.email);
        if(existsUsername || existsEmail) {
            return "";
        }

        User user = this.userRepository.save(this.mapper.map(request, User.class));

        Student student = this.mapper.map(user, Student.class);
        student.setUser(user);
        this.studentRepository.save(student);
        return "token " + user.getUsername();
    }

}
