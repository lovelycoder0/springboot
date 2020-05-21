package com.example.demo.controller;

import com.example.demo.model.Homework;
import com.example.demo.model.Student;
import com.example.demo.model.StudentHomework;
import com.example.demo.service.HomeworkService;
import com.example.demo.service.StudentHomeworkService;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/api")
public class TeacherController {

    @Resource
    private StudentService studentService;
    @Resource
    private HomeworkService homeworkService;
    @Resource
    private StudentHomeworkService studentHomeworkService;



    @RequestMapping("teacher")
    public String teacher(Model model){

        List<Student> students=studentService.findAll();
        model.addAttribute("students",students);

        List<Homework> homework=homeworkService.selectAll();
        model.addAttribute("homework",homework);

        List<StudentHomework> studentHomeworks=studentHomeworkService.find();
        model.addAttribute("studentHomeworks",studentHomeworks);

        return "teacher";
    }

    @RequestMapping(value = "addstu")
    public String addstu(Student student)  {

        return "addstu";
    }

}
