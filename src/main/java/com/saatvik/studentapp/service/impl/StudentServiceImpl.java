package com.saatvik.studentapp.service.impl;

import com.saatvik.studentapp.dao.StudentDao;
import com.saatvik.studentapp.dto.Student;
import com.saatvik.studentapp.entity.StudentEntity;
import com.saatvik.studentapp.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao){
        this.studentDao  =studentDao;
    }
    @Override
    public Student saveStudent(Student student) {
        var stud = studentDao.save(new StudentEntity(student));
        return new Student(stud);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.findAll().stream().map(Student::new).toList();

    }

    @Override
    public Student getById(Long id) {
        return studentDao.findById(id).map(Student::new).orElseThrow();
    }
}
