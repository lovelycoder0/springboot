package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Homework implements Serializable {

    private int homeworkid;
    private String homeworktitle;
}
