package com.xipeng.a11threadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    // 这个类所有对象共享ticket数据
    static int ticket = 0;

    // 锁
    // Lock是接口，需要创建实现类的对象
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            // 同步代码块
            // 当一个线程执行次代码时，其他线程不能执行此代码
            // 加锁
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                // 释放锁
                // finally中的代码无论如何都会执行
                lock.unlock();
            }
        }
    }
}
