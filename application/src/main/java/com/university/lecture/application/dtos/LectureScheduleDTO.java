package com.university.lecture.application.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LectureScheduleDTO {
    
    public Integer lectureHallId;

    public Integer lectureId;

    public Date startTime;

    public Integer duration;

    public Integer lecturerId;


}
