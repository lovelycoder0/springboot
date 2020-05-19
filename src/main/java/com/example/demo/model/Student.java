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
public class Student {

    @Id
    private int stuid;
    private String stuname;
}
