package com.company;

import java.util.Random;

public class Employee {
    private final String name;
    private static int lastId=0;
    private int id;
    private double salary;

    {
        Random generator = new Random();
        id=1+generator.nextInt(1_000_000);
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;


    }

    public String getName(){
        return name;

    }

    public Employee (String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public Employee (double salary){
        this.name="";
        this.salary=salary;
    }


    public Employee (){
        lastId++;
        id=lastId;
    }
}
