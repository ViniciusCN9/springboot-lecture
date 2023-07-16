package com.university.lecture.application.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LecturerDTO {
    
    public String firstName;

    public String lastName;

    public String bio;

}
