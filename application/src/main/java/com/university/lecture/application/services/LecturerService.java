package com.university.lecture.application.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.lecture.application.dtos.LecturerDTO;
import com.university.lecture.application.interfaces.ILecturerService;
import com.university.lecture.domain.entities.Lecturer;
import com.university.lecture.domain.repositories.ILecturerRepository;

@Service
public class LecturerService implements ILecturerService {

    @Autowired
    private ILecturerRepository lecturerRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<LecturerDTO> findAll() {
        List<Lecturer> entities = this.lecturerRepository.findAll();
        return entities
            .stream()
            .map(e -> this.mapper.map(e, LecturerDTO.class))
            .collect(Collectors.toList());
    }

    @Override
    public LecturerDTO findById(Integer id) {
        Optional<Lecturer> entity = this.lecturerRepository.findById(id);
        return this.mapper.map(entity.get(), LecturerDTO.class);
    }

    @Override
    public Lecturer create(LecturerDTO request) {
        Lecturer entity = this.mapper.map(request, Lecturer.class);
        return this.lecturerRepository.save(entity);
    }

    @Override
    public void update(Integer id, LecturerDTO request) {
        Optional<Lecturer> entity = this.lecturerRepository.findById(id);
        Lecturer updated = this.mapper.map(entity.get(), Lecturer.class);
        this.lecturerRepository.save(updated);
    }

    @Override
    public void delete(Integer id) {
        this.lecturerRepository.deleteById(id);
    }

}
