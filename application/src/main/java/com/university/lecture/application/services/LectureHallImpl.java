package com.university.lecture.application.services;

import java.util.List;

import com.university.lecture.application.dtos.LectureHallDTO;
import com.university.lecture.application.interfaces.CommonService;

public class LectureHallImpl implements CommonService<LectureHallDTO, LectureHallDTO, Integer> {

    @Override
    public List<LectureHallDTO> findAll(LectureHallDTO request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public LectureHallDTO findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public LectureHallDTO create(LectureHallDTO request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public LectureHallDTO update(LectureHallDTO request, Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
