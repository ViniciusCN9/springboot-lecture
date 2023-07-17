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

import com.university.lecture.application.dtos.LecturerDTO;
import com.university.lecture.application.interfaces.ILecturerService;
import com.university.lecture.domain.entities.Lecturer;

@Controller
@RequestMapping("/v1/lecturer")
public class LecturerController {

    @Autowired
    private ILecturerService lecturerService;

    @GetMapping
    public ResponseEntity<List<LecturerDTO>> getAllSubjects() {
        List<LecturerDTO> response = this.lecturerService.findAll();
        return ResponseEntity.ok(response);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<LecturerDTO> getSubjectById(@PathVariable Integer id) {
        LecturerDTO response = this.lecturerService.findById(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Lecturer> createSubject(@RequestBody LecturerDTO request) {
        Lecturer response = this.lecturerService.create(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(response.getId()).toUri();
        return ResponseEntity.created(uri).body(response);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> updateSubject(@PathVariable Integer id, @RequestBody LecturerDTO request) {
        this.lecturerService.update(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteSubject(@PathVariable Integer id) {
        this.lecturerService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
