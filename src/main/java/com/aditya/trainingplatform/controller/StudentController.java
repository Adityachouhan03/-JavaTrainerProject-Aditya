package com.aditya.trainingplatform.controller;

import com.aditya.trainingplatform.model.Student;
import com.aditya.trainingplatform.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired
  private StudentRepository repo;

  @PostMapping
  public Student addStudent(@RequestBody Student student) {
    return repo.save(student);
  }
}
