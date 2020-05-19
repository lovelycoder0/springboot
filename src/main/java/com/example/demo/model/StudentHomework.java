package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author lenovo
 */
@Data
@Entity
@Table
public class StudentHomework {

    @Id
    private int id;
    private int stuid;
    private int homeworkid;
    private String homeworktitle;
    private String homeworkcontent;
    private Date createtime;
    private Date updatetime;

}
