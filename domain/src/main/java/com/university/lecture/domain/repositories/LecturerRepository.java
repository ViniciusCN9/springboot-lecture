package com.university.lecture.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.lecture.domain.entities.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {
    
}
