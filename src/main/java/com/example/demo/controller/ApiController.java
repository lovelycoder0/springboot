package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.service.HomeworkService;
import com.example.demo.service.StudentHomeworkService;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author lenovo
 */
@RequestMapping("/api")
public class ApiController {

    final StudentService studentService;
    final HomeworkService homeworkService;
    final StudentHomeworkService studentHomeworkService;

    public ApiController(StudentService studentService,HomeworkService homeworkService,StudentHomeworkService studentHomeworkService) {
        this.studentService = studentService;
        this.homeworkService=homeworkService;
        this.studentHomeworkService=studentHomeworkService;
    }

    @RequestMapping("student")
    public void student(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        System.out.println("跳入学生页面");
        String id=request.getParameter("id");
        System.out.println(id);
        List<Student> list=studentService.findAll();
        request.setAttribute("list",list);
        //request.getRequestDispatcher("/Student.jsp").forward(request,response);
    }

}
