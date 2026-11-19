package com.saatvik.studentapp.service;

import com.saatvik.studentapp.dao.StudentDao;
import com.saatvik.studentapp.dto.Student;
import com.saatvik.studentapp.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    List<Student> getAll();
    Student getById(Long id);

}
