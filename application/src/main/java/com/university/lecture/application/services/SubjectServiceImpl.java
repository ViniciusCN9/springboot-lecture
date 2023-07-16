package com.university.lecture.application.services;

import java.util.List;

import com.university.lecture.application.dtos.SubjectDTO;
import com.university.lecture.application.interfaces.CommonService;

public class SubjectServiceImpl implements CommonService<SubjectDTO, SubjectDTO, Integer> {

    @Override
    public List<SubjectDTO> findAll(SubjectDTO request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public SubjectDTO findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public SubjectDTO create(SubjectDTO request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public SubjectDTO update(SubjectDTO request, Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
