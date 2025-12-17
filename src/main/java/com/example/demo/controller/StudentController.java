package com.example.demo.controller
import org.springframework.beans.factory.annotation.Autowiured;


@co


import com.example.demo.entity.


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

}