package com.xipeng.staticDemo4;

public class Student {
    String name;
    int age;
    static String teacherName;


    public void show1() {
        System.out.println(name + ", " + age + ", " + teacherName);
        show2();
    }

    public void show2() {
        System.out.println("show2");
    }

    // 静态方法中只能访问静态，不能访问成员变量和成员方法
    // 静态方法中没有this关键字
    // 非静态方法可以访问所有
    public static void method() {
        System.out.println("静态方法");
        // 无法访问this
//        System.out.println(this.age);
    }
}
