package com.xipeng.interfacedemo7;

public class InterImpl implements Inter {
    @Override
    public void method1() {
        System.out.println("重写的抽象方法");
    }

    public static void show() {
        System.out.println("InterImpl中的静态方法");
    }
}
