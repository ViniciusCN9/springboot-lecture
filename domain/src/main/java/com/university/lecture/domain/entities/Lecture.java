package com.university.lecture.domain.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_lecture")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Lecture extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 70, nullable = false)
    @Size(max = 70, message = "O nome da palestra deve ter no máximo 70 caracteres")
    private String name;

    @Column(length = 1000, nullable = false)
    @Size(max = 1000, message = "A descrição da palestra deve ter no máximo 1000 caracteres")
    private String description;
    
    @Column(nullable = false)
    private Integer duration;

    @ManyToOne
    @JoinColumn(name = "fk_mainLecturerId")
    private Lecturer mainLecturer;

    @ManyToOne
    @JoinColumn(name = "fk_subjectId", nullable = false)
    private Subject subject;

    @OneToMany(mappedBy = "lecture")
    private List<LectureSchedule> lectureSchedules;

}
