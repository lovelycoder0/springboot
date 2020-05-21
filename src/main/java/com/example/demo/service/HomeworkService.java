package com.example.demo.service;

import com.example.demo.mapper.HomeworkDao;
import com.example.demo.model.Homework;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HomeworkService {

    @Resource
    private HomeworkDao homeworkDao;

    public List<Homework> selectAll(){
        return homeworkDao.selectAll();
    }
}
