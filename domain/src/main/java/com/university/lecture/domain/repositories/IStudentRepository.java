package com.university.lecture.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.lecture.domain.entities.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {
    
}
