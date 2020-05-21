package com.example.demo.mapper;

import com.example.demo.model.Homework;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HomeworkDao {
    @Select("select * from homework")
    List<Homework> selectAll();
}
