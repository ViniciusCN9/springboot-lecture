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
@Table(name="tb_subject")
@Getter
@Setter
@SuperBuilder
public class Subject extends BaseEntity {

    @Column(length = 70, nullable = false)
    @Size(max = 70, message = "O assunto deve ter no máximo 70 caracteres")
    private String name;

    @OneToMany(mappedBy = "subject")
    private List<Lecture> lectures;

}
