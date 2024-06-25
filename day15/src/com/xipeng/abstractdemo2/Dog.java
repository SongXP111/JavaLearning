package com.xipeng.abstractdemo2;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("狗在喝水");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
