package com.xipeng.a09threadsafe1;

public class MyThread extends Thread {
    // 这个类所有对象共享ticket数据
    static int ticket = 0;

    // 锁对象，一定要是唯一的

    @Override
    public void run() {
        while (true) {
            // 同步代码块
            // 当一个线程执行次代码时，其他线程不能执行此代码
            synchronized (MyThread.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
