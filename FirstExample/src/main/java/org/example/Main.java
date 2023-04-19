package org.example;
import java.time.*;
public class Main {

    public static void main(String[] args) {
//        Test1:Methods cannot modify numeric parameters
        double percent = 10;
        tripleValue(percent);
        System.out.println("After:percent="+percent);

//        Test2:Methods cam change the state of object parameters
        var harry = new Employee("Harry", 50000);
        System.out.println("Before:"+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After:"+harry.getSalary());;

//        Test3:Methods cant attach new objects to object parameters
        var a = new Employee("Alice", 70000);
        var b = new Employee("Bob", 60000);
        System.out.println("Before a="+a.getName());
        System.out.println("Before b="+b.getName());
        swap(a,b);
        System.out.println("After a="+a.getName());
        System.out.println("After b="+b.getName());
    }
    public static void tripleValue(double x) { // doesn't work
        x = 3 * x;
        System.out.println("End of method : x="+x);
    }

    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("End of method:salary="+x.getSalary());
    }

    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method x="+x.getName());
        System.out.println("End of method y="+y.getName());
    }
}
class Employee {
    private String name;
    private double salary;
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}