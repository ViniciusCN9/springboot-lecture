package com.university.lecture.application.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.lecture.application.dtos.LectureHallDTO;
import com.university.lecture.application.interfaces.ILectureHallService;
import com.university.lecture.domain.entities.LectureHall;
import com.university.lecture.domain.repositories.ILectureHallRepository;

@Service
public class LectureHallService implements ILectureHallService {

    @Autowired
    private ILectureHallRepository lectureHallRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<LectureHallDTO> findAll() {
        List<LectureHall> entities = this.lectureHallRepository.findAll();
        return entities
            .stream()
            .map(e -> this.mapper.map(e, LectureHallDTO.class))
            .collect(Collectors.toList());
    }

    @Override
    public LectureHallDTO findById(Integer id) {
        Optional<LectureHall> entity = this.lectureHallRepository.findById(id);
        return this.mapper.map(entity.get(), LectureHallDTO.class);
    }

    @Override
    public LectureHall create(LectureHallDTO request) {
        LectureHall entity = this.mapper.map(request, LectureHall.class);
        return this.lectureHallRepository.save(entity);
    }

    @Override
    public void update(Integer id, LectureHallDTO request) {
        Optional<LectureHall> entity = this.lectureHallRepository.findById(id);
        LectureHall updated = this.mapper.map(entity.get(), LectureHall.class);
        this.lectureHallRepository.save(updated);
    }

    @Override
    public void delete(Integer id) {
        this.lectureHallRepository.deleteById(id);
    }

}
