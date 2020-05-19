package com.example.demo;

import com.example.demo.model.Homework;
import com.example.demo.model.Student;
import com.example.demo.model.StudentHomework;
import com.example.demo.service.HomeworkService;
import com.example.demo.service.StudentHomeworkService;
import com.example.demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DemoApplication {

    final StudentService studentService;
    final HomeworkService homeworkService;
    final StudentHomeworkService studentHomeworkService;
    public DemoApplication(StudentService studentService, HomeworkService homeworkService, StudentHomeworkService studentHomeworkService) {
        this.studentService = studentService;
        this.homeworkService = homeworkService;
        this.studentHomeworkService = studentHomeworkService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("get")
    public Object get(){
        return "Hello world！";
    }

    @RequestMapping("student")
    public List<Student> findAll1(){

        return studentService.findAll();
    }

    @RequestMapping("homework")
    public List<Homework> findAll2(){

        return homeworkService.findAll();
    }

    @RequestMapping("studenthomework")
    public List<StudentHomework> findAll3(){

        return studentHomeworkService.findAll();
    }
}
