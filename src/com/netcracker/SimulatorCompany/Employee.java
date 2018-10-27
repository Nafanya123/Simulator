package com.netcracker.SimulatorCompany;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    private String name;
    private double salary;
    private String position;
    private String date;
    Date parsingDate;

    Employee(String name, double salary, String position)
    {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }
    Employee(String name, double salary, String position, String date)
    {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.date = date;
    }
    public void rept()
    {
        DateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
        Date isDate = new Date();
        try
        {
            parsingDate = ft.parse(getDate());
            int monthNumber = (isDate.getYear() - parsingDate.getYear());
            if(monthNumber <= 0)
            {
                int month = parsingDate.getMonth() + 1;
                double received = month * getSalary();
                int a = (int)received;
                System.out.println("Отчет по зарплате за " + month + " месяц(ев), (с момента принятия на работу), у " + getPosition() + "а " + getName() + ", составляет: " + a + " рублей");
            }
            else
            {
                int month = monthNumber * 12 - (parsingDate.getMonth() + 1);
                double received = (month * (getSalary() * 1.26));
                int a = (int)received;
                //System.out.printf("%s %te %<tB %<tY", "",parsingDate);
                //System.out.printf("%s %te %<tB %<tY", "",isDate);
                System.out.println("Отчет по зарплате за " + month + " месяц(ев), (с момента принятия на работу), у " + getPosition() + "а " + getName() + ", составляет: " + a + " рублей");
            }
        }catch (ParseException e)
        {
            System.out.printf("Нераспаршена с помощью " + ft);
        }
    }

    public void printSalaryReport()
    {
        System.out.println("Имя: " + getName() +", Должность: " + getPosition() + ". Оклад: " + getSalary() + " рублей.");
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getDate() {
        return date;
    }
}
