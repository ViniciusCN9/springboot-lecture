package com.university.lecture.domain.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="tb_lecturer")
@Getter
@Setter
@SuperBuilder
public class Lecturer extends BaseEntity {

    @Column(length = 70, nullable = false)
    @Size(max = 70, message = "O primeiro nome do palestrante deve ter no máximo 70 caracteres")
    private String firstName;

    @Column(length = 70, nullable = false)
    @Size(max = 70, message = "O sobrenome do palestrante deve ter no máximo 70 caracteres")
    private String lastName;

    @Column(length = 1000, nullable = false)
    @Size(max = 1000, message = "O depoimento do palestrante deve ter no máximo 1000 caracteres")
    private String bio;

    @OneToMany(mappedBy = "mainLecturer")
    private List<Lecture> lectures;

    @OneToMany(mappedBy = "lecturer")
    private List<LectureSchedule> lectureSchedules;
    
}
