package com.xipeng.myexception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // 年龄：18 - 40
        s1.setAge(50);
        System.out.println(s1.getAge());
    }
}
