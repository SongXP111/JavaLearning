package com.xipeng.codeBlockDemo2;

public class Student {
    private String name;
    private int age;

    static {
        System.out.println("静态代码块");
    }

    public Student() {
        System.out.println("空参");
    }

    public Student(String name, int age) {
        System.out.println("有参");
        this.name = name;
        this.age = age;
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
