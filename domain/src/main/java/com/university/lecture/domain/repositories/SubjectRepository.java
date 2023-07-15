package com.university.lecture.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.lecture.domain.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    
}
