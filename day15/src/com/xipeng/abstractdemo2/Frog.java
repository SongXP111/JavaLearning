package com.xipeng.abstractdemo2;

public class Frog extends Animal {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("青蛙在喝水");
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }
}
