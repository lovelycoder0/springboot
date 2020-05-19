package com.example.demo.service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo
 */
@Service
public class StudentService {

    final StudentMapper studentMapper;


    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public List<Student> findAll(){
        return studentMapper.findAll();
    }

    public void submitstu(Student student){
        studentMapper.save(student);
    }
}
