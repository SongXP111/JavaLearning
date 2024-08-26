package com.xipeng.a08threadmethod5;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        // 插入/插队线程
        // Public final void join()

        MyThread t1 = new MyThread();

        t1.setName("土豆");

        t1.start();

        // 把t1插入到当前线程之前
        t1.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
