package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired //Indica que el StudentService se instancia automáticamente y se introduce en el constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping //genera end point
    public List<Student> getStudents(){

        return studentService.getStudents();
    }

}
