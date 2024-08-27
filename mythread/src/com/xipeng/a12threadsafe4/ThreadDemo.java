package com.xipeng.a12threadsafe4;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        * 死锁
        * 互相等待对方释放锁
        * */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程A");
        t2.setName("线程B");

        t1.start();
        t2.start();

        // 线程A拿到了A锁，准备拿B锁
        // 线程B拿到了B锁，准备拿A锁
        // 卡死
    }
}
