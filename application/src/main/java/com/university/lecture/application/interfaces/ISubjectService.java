package com.university.lecture.application.interfaces;

import java.util.List;

import com.university.lecture.application.dtos.SubjectDTO;
import com.university.lecture.domain.entities.Subject;

public interface ISubjectService {
    
    public List<SubjectDTO> findAll();

    public SubjectDTO findById(Integer id);

    public Subject create(SubjectDTO request);

    public void update(Integer id, SubjectDTO request);

    public void delete(Integer id);

}
