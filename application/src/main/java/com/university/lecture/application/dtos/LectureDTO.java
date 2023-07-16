package com.university.lecture.application.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LectureDTO {
    
    public String name;

    public String description;

    public Integer duration;

    public Integer mainLecturerId;

    public Integer subjectId;

}
