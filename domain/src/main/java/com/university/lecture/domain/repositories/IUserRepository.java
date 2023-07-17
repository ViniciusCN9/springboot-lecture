package com.university.lecture.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.lecture.domain.entities.User;

public interface IUserRepository extends JpaRepository<User, Integer>{
    
    public User findByUsernameAndPassword(String username, String password);

    public boolean existsByUsername(String username);

    public boolean existsByEmail(String email);

}
