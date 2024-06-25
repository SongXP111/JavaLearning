package com.xipeng.polyDemo2;

public class Test {
    public static void main(String[] args) {
        // 多态成员调用
        // 变量调用：编译看左边，运行也看左边
        // 方法调用：编译看左边，运行看右边

        // 编译看左边：javac编译代码的时候，会看左边的父类中有没有这个变量，如果有，编译成功，否则失败
        // 运行也看左边：java运行代码的时候，实际获取的是左边父类中成员变量的值
        Animal a = new Dog();
        System.out.println(a.name);

        // 编译看左边：javac编译代码的时候，会看左边的父类中有没有这个方法，如果有，编译成功，否则失败
        // 运行看右边：java运行代码的时候，实际运行的是子类中的方法
        a.show();

        // 成员变量：在子类的对象中，会把父类的成员变量继承下来
        // 成员方法：如果子类对方法进行了重写，那么在虚方法表中，会把父类方法进行覆盖
    }
}

class Animal {
    String name = "动物";

    public void show() {
        System.out.println("Animal show");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog show");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat show");
    }
}