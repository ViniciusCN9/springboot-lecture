package com.university.lecture.domain.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_student")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Student extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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