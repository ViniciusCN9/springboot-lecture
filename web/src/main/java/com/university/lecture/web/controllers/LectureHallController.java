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

import com.university.lecture.application.dtos.LectureHallDTO;
import com.university.lecture.application.interfaces.ILectureHallService;
import com.university.lecture.domain.entities.LectureHall;

@Controller
@RequestMapping("/v1/lectureHall")
public class LectureHallController {

    @Autowired
    private ILectureHallService lectureHallService;

    @GetMapping
    public ResponseEntity<List<LectureHallDTO>> getAllSubjects() {
        List<LectureHallDTO> response = this.lectureHallService.findAll();
        return ResponseEntity.ok(response);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<LectureHallDTO> getSubjectById(@PathVariable Integer id) {
        LectureHallDTO response = this.lectureHallService.findById(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<LectureHall> createSubject(@RequestBody LectureHallDTO request) {
        LectureHall response = this.lectureHallService.create(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(response.getId()).toUri();
        return ResponseEntity.created(uri).body(response);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> updateSubject(@PathVariable Integer id, @RequestBody LectureHallDTO request) {
        this.lectureHallService.update(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteSubject(@PathVariable Integer id) {
        this.lectureHallService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
