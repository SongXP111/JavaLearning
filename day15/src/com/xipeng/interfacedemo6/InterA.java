package com.xipeng.interfacedemo6;

public interface InterA {
    public abstract void method1();

    public default void show() {
        System.out.println("InterA 默认方法");
    }
}
