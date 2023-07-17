package com.university.lecture.web.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.university.lecture.application.dtos.SubjectDTO;
import com.university.lecture.application.interfaces.ISubjectService;
import com.university.lecture.domain.entities.Subject;

@Controller
@RequestMapping("/v1/subject")
public class SubjectController {

    @Autowired
    private ISubjectService subjectService;

    @GetMapping
    public ResponseEntity<List<SubjectDTO>> getAllSubjects() {
        List<SubjectDTO> response = this.subjectService.findAll();
        return ResponseEntity.ok(response);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<SubjectDTO> getSubjectById(@PathVariable Integer id) {
        SubjectDTO response = this.subjectService.findById(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Subject> createSubject(@RequestBody SubjectDTO request) {
        Subject response = this.subjectService.create(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(response.getId()).toUri();
        return ResponseEntity.created(uri).body(response);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> updateSubject(@PathVariable Integer id, @RequestBody SubjectDTO request) {
        this.subjectService.update(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteSubject(@PathVariable Integer id) {
        this.subjectService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
