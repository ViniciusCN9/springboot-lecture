package com.university.lecture.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.university.lecture.domain.enums.Role;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="tb_user")
@Getter
@Setter
@SuperBuilder
public class User extends BaseEntity {

    @Column(length = 70, nullable = false)
    @Size(max = 70, message = "O nome do usuário deve ter no máximo 70 caracteres")
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Email(message = "Email inválido")
    private String email;

    @Column(nullable = false)
    private Role role;

    @OneToOne(mappedBy = "user")
    private Student student;

}
