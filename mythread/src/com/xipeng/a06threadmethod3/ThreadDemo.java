package com.xipeng.a06threadmethod3;

public class ThreadDemo {
    public static void main(String[] args) {
        // 守护线程（备胎线程）
        // setDaemon
        // 当其他的非守护线程执行完毕之后，守护线程会陆续结束
        // 当女神线程结束，备胎线程也就结束了

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("女神");
        t2.setName("备胎");

        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
