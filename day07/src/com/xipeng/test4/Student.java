package com.xipeng.test4;

public class Student {
    private String name;
    private int age;

    // 构造方法
    public Student() {
        System.out.println("构造了一个学生");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
