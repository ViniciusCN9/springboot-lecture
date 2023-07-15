package com.university.lecture.domain.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_lecture_schedule")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LectureSchedule {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_lectureHallId", nullable = false)
    private LectureHall lectureHall;

    @ManyToOne
    @JoinColumn(name = "fk_lectureId", nullable = false)
    private Lecture lecture;

    @Column(nullable = false)
    private Date startTime;

    @Column(nullable = false)
    private Integer duration;

    @ManyToOne
    @JoinColumn(name = "fk_lecturerId", nullable = false)
    private Lecture lecturer;

    @ManyToMany
    @JoinTable(
        name = "tb_lecture_registration", 
        joinColumns = @JoinColumn(name = "fk_lectureScheduleId"),
        inverseJoinColumns = @JoinColumn(name = "fk_studentId"))
    private List<Student> studentRegistrations;
}
