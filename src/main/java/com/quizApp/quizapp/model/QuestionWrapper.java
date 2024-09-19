package com.quizApp.quizapp.model;

import lombok.Data;

@Data
public class QuestionWrapper {

    private Integer rollno;
    private String name;
    private Integer marks;

    public QuestionWrapper(Integer rollno, String name, Integer marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
