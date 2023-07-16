package com.university.lecture.application.services;

import java.util.List;

import com.university.lecture.application.dtos.LecturerDTO;
import com.university.lecture.application.interfaces.CommonService;

public class LecturerServiceImpl implements CommonService<LecturerDTO, LecturerDTO, Integer> {

    @Override
    public List<LecturerDTO> findAll(LecturerDTO request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public LecturerDTO findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public LecturerDTO create(LecturerDTO request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public LecturerDTO update(LecturerDTO request, Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
