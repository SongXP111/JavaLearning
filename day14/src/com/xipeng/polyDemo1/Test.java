package com.xipeng.polyDemo1;

public class Test {
    public static void main(String[] args) {
        // 多态：同类型的对象表现出不同的形态
        // 形式：父类类型 对象名称 = 子类对象
        // 前提：有继承关系，有父类引用指向子类，有方法重写
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王建国");
        t.setAge(30);

        Administrator admin = new Administrator();
        admin.setName("管理员");
        admin.setAge(35);

        register(s);
        register(t);
        register(admin);

    }

    // 能接受老师，学生，管理员
    // 只能写成父类(可以传递所有的子类)
    public static void register(Person p) {
        p.show();
    }
}
