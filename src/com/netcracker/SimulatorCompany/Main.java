package com.netcracker.SimulatorCompany;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();

        Boss bossOleg = new Boss("Олег", 100650, "Босс", "11.10.2010");
        Developer developerVasy = new Developer("Вася", 80544, "Программист", "11.07.2013");
        Developer developerSerge = new Developer("Сергей", 80544, "Программист", "11.07.2014");
        Developer developerMax = new Developer("Максим", 80544, "Программист", "11.07.2018");
        Janitor janitorAlexhander = new Janitor("Александр", 80544, "Уборщик", "11.07.2017");
        Janitor janitorSam = new Janitor("Семен", 80544, "Уборщик", "11.07.2015");

        company.recrut(bossOleg);
        company.recrut(developerVasy);
        company.recrut(developerSerge);
        company.recrut(developerMax);
        company.recrut(janitorAlexhander);
        company.recrut(janitorSam);

        System.out.println();

        bossOleg.manager("Всем работать!!!");

        System.out.println();

        developerVasy.programm();
        developerSerge.programm();
        developerMax.programm();
        janitorAlexhander.clenUp();
        janitorSam.offTime();

        System.out.println();

        company.printSalaryReport();
        
         System.out.println();
         

        bossOleg.rept();
        developerVasy.rept();
        developerSerge.rept();
        developerMax.rept();
        janitorAlexhander.rept();
        janitorSam.rept();
    }
}