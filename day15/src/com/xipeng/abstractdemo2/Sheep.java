package com.xipeng.abstractdemo2;

public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("山羊在喝水");
    }

    @Override
    public void eat() {
        System.out.println("山羊吃草");
    }
}
