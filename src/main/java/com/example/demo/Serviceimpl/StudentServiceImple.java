package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.service.StudentService;



@Service
public class StudentServiceImple implements StudentService {
    
    private final StudentRepository StudentRepository;
    public StudentServiceImple(StudentRepository studentRepository){
    this.studentRepository=studentRepository;
}

@Autowired
StudentRepository StudentService


 public Student saveStudent(Student student){
        return studentRepository.save(student )
    }

}