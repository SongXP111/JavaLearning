package com.xipeng.a13waitandnotify;

public class Foodie extends Thread {
    @Override
    public void run() {
        /*
         * 1. 循环
         * 2. 同步代码块（同步方法/lock锁）
         * 3. 判断共享数据是否到了末尾（先写到了末尾）
         * 4. 没有到末尾，执行核心逻辑
         * */
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    // 先判断桌子上是否有面条
                    if (Desk.foodFlag == 0) {
                        // 如果没有就等待
                        try {
                            Desk.lock.wait(); // 让当前线程和锁进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        // 有面条
                        // 把吃的总数-1
                        Desk.count--;
                        // 开吃
                        System.out.println("吃货正在吃面条，还能再吃" + Desk.count + "碗");
                        // 吃完之后，唤醒厨师继续做
                        Desk.lock.notifyAll();
                        // 修改桌子的状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
