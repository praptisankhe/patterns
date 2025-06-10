package com.design.pattern.singleton;

public class Student {

    //Eagar initialization
    private static Student student=new Student();

    private Student(){

    }
    public static Student getStudent()
    {
        return student;
    }
}
