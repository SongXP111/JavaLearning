package com.xipeng.a10threadsafe2;

public class MyRunnable implements Runnable {

    int ticket = 0;

    @Override
    public void run() {
        // 循环
        // 同步代码块（同步方法）
        // 判断共享数据是否到了末尾

        while (true) {
            if (method()) break;
        }
    }

    // 锁对象：this
    private synchronized boolean method() {
        if (ticket == 100) {
            return true;
        } else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票！！！");
        }
        return false;
    }
}
