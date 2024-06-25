package com.xipeng.staticDemo1;

public class Student {
    private String name;
    private int age;
    private String gender;

    // 静态变量
    // 被该类所有对象共享
    // 推荐用类名调用，也可以一个对象名调用
    // 不属于对象，属于类
    // 随着类的加载而加载，优先于对象存在
    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println(this.name + "正在学习");
    }

    public void show() {
        System.out.println(this.name + ", " + this.age + ", " + this.gender + ", " + this.teacherName);
    }
}
