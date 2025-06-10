package com.design.pattern.singleton;

public class Employee {
    private static Employee employee;
    private Employee()
    {

    }
//lazy way of initialization
    public static Employee getEmployee()
    {
        if(employee==null)
        {
            employee= new Employee();
        }
        return employee;
    }
}



// Singleton design pattern
//1. private constructor
//2. Initialize object with private static
//3. create object with the help of method
