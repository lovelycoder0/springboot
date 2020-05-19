package com.example.demo.mapper;

import com.example.demo.model.StudentHomework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentHomeworkMapper extends JpaRepository<StudentHomework,Integer> {
}
