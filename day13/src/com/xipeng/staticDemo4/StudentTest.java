package com.xipeng.staticDemo4;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "阿伟";

        Student s1 = new Student();
        s1.name = "zhangsan";
        s1.age = 18;
        s1.show1();
    }
}
