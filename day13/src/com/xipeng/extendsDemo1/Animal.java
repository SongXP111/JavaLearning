package com.xipeng.extendsDemo1;

public class Animal {

    // private：子类无法访问（只能在本类访问）
    // 子类只能访问父类中非私有的成员
    public void eat() {
        System.out.println("吃东西");
    }

    public void drink() {
        System.out.println("喝水");
    }
}
