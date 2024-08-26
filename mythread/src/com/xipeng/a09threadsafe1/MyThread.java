package com.xipeng.a09threadsafe1;

public class MyThread extends Thread {
    // 这个类所有对象共享ticket数据
    static int ticket = 0;

    @Override
    public void run() {
        while (true) {
            if (ticket < 100) {
                try {
                    Thread.sleep(100);
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
