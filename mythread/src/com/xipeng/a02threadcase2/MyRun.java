package com.xipeng.a02threadcase2;

public class MyRun implements Runnable {
    @Override
    public void run() {
        // 线程执行代码
        for (int i = 0; i < 100; i++) {
            // 获取当前线程的对象
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " Hello World");
        }
    }
}
