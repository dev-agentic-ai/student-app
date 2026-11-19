package com.saatvik.studentapp.dto;

import com.saatvik.studentapp.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private Long id;
    private String name;


    public Student(StudentEntity stud) {
        this.id = stud.getId();
        this.name = stud.getName();
    }
}
