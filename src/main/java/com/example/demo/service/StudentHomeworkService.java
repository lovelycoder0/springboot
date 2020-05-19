package com.example.demo.service;

import com.example.demo.mapper.StudentHomeworkMapper;
import com.example.demo.model.StudentHomework;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo
 */
@Service
public class StudentHomeworkService {

    final StudentHomeworkMapper studentHomeworkMapper;

    public StudentHomeworkService(StudentHomeworkMapper studentHomeworkMapper) {
        this.studentHomeworkMapper = studentHomeworkMapper;
    }

    public List<StudentHomework> findAll(){
        return studentHomeworkMapper.findAll();
    }

    public void submitstuwork(StudentHomework studentHomework){
        studentHomeworkMapper.save(studentHomework);
    }
}
