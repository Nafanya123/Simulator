package com.netcracker.SimulatorCompany;

public class Boss extends Employee{

    public Boss(String name, double salary, String position)
    {
        super(name, salary, position);
        System.out.println("На работу принят: " + name + " на должность: " + position + ", с окладом: " + salary);
    }

    public Boss(String name, double salary, String position, String date)
    {
        super(name, salary, position, date);
        System.out.println("На работу принят: " + name + " на должность: " + position + ", с окладом: " + salary);
    }

    public void manager(String m)
    {
        System.out.println(getPosition() + " " + getName() + " Говорит: " + m);
    }

}