package com.university.lecture.application.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LectureHallDTO {
    
    public String name;

    public Integer capacity;

}
