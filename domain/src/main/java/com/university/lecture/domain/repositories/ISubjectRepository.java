package com.university.lecture.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.lecture.domain.entities.Subject;

public interface ISubjectRepository extends JpaRepository<Subject, Integer> {
    
}
