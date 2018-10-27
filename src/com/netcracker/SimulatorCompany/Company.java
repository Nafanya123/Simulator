package com.netcracker.SimulatorCompany;

public class Company {

    Employee[] employees;
    private int counter;

    public Company()
    {
        employees = new Employee[6];
    }

    public void recrut(Employee employee)
    {
        if(counter < employees.length)
        {
            employees[counter++] = employee;
        }
    }
    
    public void printSalaryReport()
    {
        for(int i = 0; i < employees.length; i++)
        {
            System.out.println("Имя: " + employees[i].getName() +", Должность: " + employees[i].getPosition() + ". Оклад: " + employees[i].getSalary() + " рублей.");
        }
            
        
    }
}
