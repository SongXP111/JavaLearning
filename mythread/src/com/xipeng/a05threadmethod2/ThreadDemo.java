package com.xipeng.a05threadmethod2;

public class ThreadDemo {
    public static void main(String[] args) {
        // 线程优先级
        // setPriority
        // getPriority

        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "飞机");
        Thread t2 = new Thread(mr, "坦克");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getPriority());

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
