package org.example;

public class Student {
    private String major;
    private String name;
    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }
    public String getName(){
        return this.name;
    }

    public String getMajor() {
        return major;
    }

    public String getDescription() {
        return "a student major in " + major;
    }
}
