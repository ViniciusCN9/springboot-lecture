package com.university.lecture.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.lecture.domain.entities.LectureSchedule;

public interface ILectureScheduleRepository extends JpaRepository<LectureSchedule, Integer> {
    
}
