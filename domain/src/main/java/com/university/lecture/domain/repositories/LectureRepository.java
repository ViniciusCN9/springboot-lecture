package com.university.lecture.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.lecture.domain.entities.Lecture;

public interface LectureRepository extends JpaRepository<Lecture, Integer> {
    
}
