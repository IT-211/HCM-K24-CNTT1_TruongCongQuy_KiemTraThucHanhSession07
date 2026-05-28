package com.re.ss6.controller;

import com.re.ss6.entity.Student;
import com.re.ss6.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentRepository studentRepository;

    // get all
    @GetMapping
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        return studentRepository.findAll();
    }

    // get by id
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // post
    @PostMapping
    public

    // put
    // patch
    // delete
}
