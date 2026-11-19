package com.saatvik.studentapp.entity;

import com.saatvik.studentapp.dto.Student;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue
    @Column(name = "stud_id")
    private Long id;
    @Column(name = "stud_name")
    private String name;


    public StudentEntity(Student student) {
        this.name = student.getName();
        this.id = student.getId();
    }
}
