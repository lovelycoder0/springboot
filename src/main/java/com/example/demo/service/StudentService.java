package com.example.demo.service;

import com.example.demo.mapper.StudentDao;
import com.example.demo.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Resource
    private StudentDao studentDao;

    public List<Student> findAll(){
        return studentDao.findAll();
    }


}
