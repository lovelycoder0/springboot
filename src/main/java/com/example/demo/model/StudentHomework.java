package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class StudentHomework implements Serializable {
    private int id;
    private int stuid;
    private int homeworkid;
    private String homeworktitle;
    private String homeworkContent;
    private Date createtime;
    private Date updatetime;
}
