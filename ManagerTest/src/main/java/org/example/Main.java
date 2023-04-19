package org.example;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
//        construct a manager object
        var boss = new Manager("Josh", 80000, 1987,6,12);
        boss.setBonus(5000);

        var staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry", 50000, 1977, 2,13);
        staff[2] = new Employee("Tommy", 40000, 1990, 4,24);

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

class Manager extends Employee
{
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary() {
        double salary = super.getSalary();
        return salary + bonus;
    }
}