package com.example.demo.mapper;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentMapper extends JpaRepository<Student,Integer> {
}
