package com.netcracker.SimulatorCompany;


public class Janitor extends Employee{

    private String position = "Уборщик";

    public Janitor(String name, double salary, String position)
    {
        super(name, salary, position);
        System.out.println("На работу принят: " + name + " на должность: " + position + ", с окладом: " + salary);
    }

    public Janitor(String name, double salary, String position, String date)
    {
        super(name, salary, position, date);
        System.out.println("На работу принят: " + name + " на должность: " + position + ", с окладом: " + salary);
    }

    public void clenUp()
    {
        System.out.println(position +" " + getName() +" убирает");
    }

    public void offTime()
    {
        System.out.println("У " + position +"а " + getName() +" сегодня выходной");
    }
}