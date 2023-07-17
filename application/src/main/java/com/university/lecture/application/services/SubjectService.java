package com.university.lecture.application.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.lecture.application.dtos.SubjectDTO;
import com.university.lecture.application.interfaces.ISubjectService;
import com.university.lecture.domain.entities.Subject;
import com.university.lecture.domain.repositories.ISubjectRepository;

@Service
public class SubjectService implements ISubjectService {

    @Autowired
    private ISubjectRepository subjectRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<SubjectDTO> findAll() {
        List<Subject> entities = this.subjectRepository.findAll();
        return entities
            .stream()
            .map(e -> this.mapper.map(e, SubjectDTO.class))
            .collect(Collectors.toList());
    }

    @Override
    public SubjectDTO findById(Integer id) {
        Optional<Subject> entity = this.subjectRepository.findById(id);
        return this.mapper.map(entity.get(), SubjectDTO.class);
    }

    @Override
    public Subject create(SubjectDTO request) {
        Subject entity = this.mapper.map(request, Subject.class);
        return this.subjectRepository.save(entity);
    }

    @Override
    public void update(Integer id, SubjectDTO request) {
        Optional<Subject> entity = this.subjectRepository.findById(id);
        Subject updated = this.mapper.map(entity.get(), Subject.class);
        this.subjectRepository.save(updated);
    }

    @Override
    public void delete(Integer id) {
        this.subjectRepository.deleteById(id);
    }

}
