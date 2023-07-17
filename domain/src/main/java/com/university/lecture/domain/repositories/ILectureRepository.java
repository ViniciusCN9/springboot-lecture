package com.university.lecture.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.lecture.domain.entities.Lecture;

public interface ILectureRepository extends JpaRepository<Lecture, Integer> {
    
}
