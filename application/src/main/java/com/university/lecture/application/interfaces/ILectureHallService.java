package com.university.lecture.application.interfaces;

import java.util.List;

import com.university.lecture.application.dtos.LectureHallDTO;
import com.university.lecture.domain.entities.LectureHall;

public interface ILectureHallService {
    
    public List<LectureHallDTO> findAll();

    public LectureHallDTO findById(Integer id);

    public LectureHall create(LectureHallDTO request);

    public void update(Integer id, LectureHallDTO request);

    public void delete(Integer id);

}
