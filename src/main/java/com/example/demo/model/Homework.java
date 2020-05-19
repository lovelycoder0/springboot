package com.example.demo.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lenovo
 */
@Data
@Entity
@Table
public class Homework {

    @Id
    private int homeworkid;
    private String homeworktitle;

}
