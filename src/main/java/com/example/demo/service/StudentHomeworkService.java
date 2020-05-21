package com.example.demo.service;

import com.example.demo.mapper.StudentHomeworkDao;
import com.example.demo.model.StudentHomework;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentHomeworkService {

    @Resource
    private StudentHomeworkDao studentHomeworkDao;

    public List<StudentHomework> find(){
        return studentHomeworkDao.find();
    }
}
