package org.example;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//        1.第一种方式
//        全类名：包名+类名
//        最为常用
        Class clazz1 = Class.forName("org.example.Student");
        System.out.println(clazz1);

//        2.第二种方式
//        一般更多当作参数进行传递
        Class clazz2 = Student.class;
        System.out.println(clazz2);

//        3.第三种方式
//        当我们已经有了这个类的对象时，才可以使用
        Student student = new Student("josh", "optics");
        Class clazz3 = student.getClass();
        System.out.println(clazz2==clazz3);
    }
}