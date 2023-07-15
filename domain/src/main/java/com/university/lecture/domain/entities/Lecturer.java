package com.university.lecture.domain.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_lecturer")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Lecturer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
