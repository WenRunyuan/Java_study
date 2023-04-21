package org.example;

public class Main {
    public static void main(String[] args) {
        var people = new Person[2];

        people[0] = new Employee("Josh", 20000, 1998, 4, 24);
        people[1] = new Student("Nore", "computer science");

        for (Person p : people)
            System.out.println(p.getName() + "," + p.getDescription());
    }
}