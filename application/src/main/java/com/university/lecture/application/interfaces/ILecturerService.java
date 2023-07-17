package com.university.lecture.application.interfaces;

import java.util.List;

import com.university.lecture.application.dtos.LecturerDTO;
import com.university.lecture.domain.entities.Lecturer;

public interface ILecturerService {
    
    public List<LecturerDTO> findAll();

    public LecturerDTO findById(Integer id);

    public Lecturer create(LecturerDTO request);

    public void update(Integer id, LecturerDTO request);

    public void delete(Integer id);

}
