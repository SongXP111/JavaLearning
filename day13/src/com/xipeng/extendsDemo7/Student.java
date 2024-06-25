package com.xipeng.extendsDemo7;

public class Student {
    String name;
    int age;
    String school;

    // 需求：默认为传志大学

    public Student() {
        // 表示调用本类其他构造方法
        this(null, 0, "传志大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
