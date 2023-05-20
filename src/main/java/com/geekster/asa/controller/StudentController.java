package com.geekster.asa.controller;

import com.geekster.asa.model.Student;
import com.geekster.asa.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    IStudentRepo iStudentRepo;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        iStudentRepo.save(student);
        return "Student added successfully!!";
    }
    @GetMapping("/get")
    public List<Student> getStudent(){
       return iStudentRepo.findAll();
    }
}
