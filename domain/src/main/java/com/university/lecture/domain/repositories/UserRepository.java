package com.university.lecture.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.lecture.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
