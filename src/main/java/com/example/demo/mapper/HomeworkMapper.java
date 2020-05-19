package com.example.demo.mapper;

import com.example.demo.model.Homework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkMapper extends JpaRepository<Homework,Integer> {
}
