package com.example.demo.mapper;

import com.example.demo.model.StudentHomework;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface StudentHomeworkDao {
    @Select("select * from studenthomework")
    List<StudentHomework> find();
}
