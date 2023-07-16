package com.university.lecture.domain.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="tb_student")
@Getter
@Setter
@SuperBuilder
public class Student extends BaseEntity {

    @Column(length = 70, nullable = false)
    @Size(max = 70, message = "O primeiro nome do estudante deve ter no máximo 70 caracteres")
    private String firstName;

    @Column(length = 70, nullable = false)
    @Size(max = 70, message = "O sobrenome do estudante deve ter no máximo 70 caracteres")
    private String lastName;

    @Column(length = 10, nullable = false)
    @Size(min = 10, max = 10, message = "O número do cartão do estudante deve ter 10 caracteres")
    private String studentCardNumber;

    @OneToOne
    @JoinColumn(name = "fk_userId", unique = true)
    private User user;

    @ManyToMany(mappedBy = "studentRegistrations")
    private List<LectureSchedule> lectureRegistrations;

}