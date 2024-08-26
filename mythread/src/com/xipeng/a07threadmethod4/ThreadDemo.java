package com.xipeng.a07threadmethod4;

public class ThreadDemo {
    public static void main(String[] args) {
        // 出让/礼让线程
        // yield

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();
    }
}
