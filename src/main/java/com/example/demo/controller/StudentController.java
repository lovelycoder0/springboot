package com.example.demo.controller;

import com.example.demo.mapper.HomeworkDao;
import com.example.demo.mapper.StudentDao;
import com.example.demo.mapper.StudentHomeworkDao;
import com.example.demo.model.Homework;
import com.example.demo.model.Student;
import com.example.demo.model.StudentHomework;
import com.example.demo.service.HomeworkService;
import com.example.demo.service.StudentHomeworkService;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/api")
public class StudentController {

    @Resource
    private StudentService studentService;
    @Resource
    private HomeworkService homeworkService;
    @Resource
    private StudentHomeworkService studentHomeworkService;

    @RequestMapping("student")
    public String student(Model model){
        List<Student> students=studentService.findAll();
        model.addAttribute("students",students);

        List<Homework> homework=homeworkService.selectAll();
        model.addAttribute("homework",homework);

        List<StudentHomework> studentHomeworks=studentHomeworkService.find();
        model.addAttribute("studentHomeworks",studentHomeworks);

        return "student";
    }

}
