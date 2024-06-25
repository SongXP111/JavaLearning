package com.xipeng.interfacedemo6;

public interface InterB {
    public default void show() {
        System.out.println("InterB 默认方法");
    }
}
