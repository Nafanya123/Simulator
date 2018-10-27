package com.netcracker.SimulatorCompany;

public class Developer extends Employee{

    private String position = "Программист";

    public Developer(String name, double salary, String position)
    {
        super(name, salary, position);
        System.out.println("На работу принят: " + name + " на должность: " + position + ", с окладом: " + salary);
    }

    public Developer(String name, double salary, String position, String date)
    {
        super(name, salary, position, date);
        System.out.println("На работу принят: " + name + " на должность: " + position + ", с окладом: " + salary);
    }

    public void programm()
    {
        System.out.println(position + " " + getName() +" программирует");
    }
}