package com.saatvik.studentapp.controller;

import com.saatvik.studentapp.dto.Student;
import com.saatvik.studentapp.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id){
        return studentService.getById(id);
    }

    @PostMapping
    public Student saveStudent(@Valid @RequestBody Student student){
        return studentService.saveStudent(student);
    }

}
