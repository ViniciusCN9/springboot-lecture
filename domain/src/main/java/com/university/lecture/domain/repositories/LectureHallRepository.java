package com.university.lecture.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.lecture.domain.entities.LectureHall;

public interface LectureHallRepository extends JpaRepository<LectureHall, Integer> {
    
}
