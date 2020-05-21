package com.example.demo.mapper;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentDao {
    @Select("select * from student")
    List<Student> findAll();

    @Insert("insert into student('stuid','stuname') values (#{stuid},#{stuname})")
    void addstu(Student student);
}
