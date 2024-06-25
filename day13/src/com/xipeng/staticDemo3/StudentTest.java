package com.xipeng.staticDemo3;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Student s1 = new Student("张三", 23, "男");
        Student s2 = new Student("李四", 24, "女");
        Student s3 = new Student("王五", 25, "男");

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(StudentUtil.getMaxAgeStudent(students));
    }
}
