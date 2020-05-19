package com.example.demo.service;

import com.example.demo.mapper.HomeworkMapper;
import com.example.demo.model.Homework;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo
 */
@Service
public class HomeworkService {

    final HomeworkMapper homeworkMapper;

    public HomeworkService(HomeworkMapper homeworkMapper) {
        this.homeworkMapper = homeworkMapper;
    }

    public List<Homework> findAll(){
        return homeworkMapper.findAll();
    }

    public void submithomework(Homework homework){
        homeworkMapper.save(homework);
    }
}
