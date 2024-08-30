package com.xipeng.a15test1;

import java.util.Random;

public class MyThread extends Thread {
    // 共享数据
    static double money = 100;
    static int count = 3;

    // 中奖的最小金额
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (count == 0) {
                System.out.println(getName() + "没有抢到红包！");
            } else {
                // 不能直接随机
                // 要在剩余的钱里随机
                double prize;
                if (count == 1) {
                    // 无需随机
                    prize = money;
                } else {
                    Random r = new Random();
                    double bound = money - (count - 1) * MIN;
                    prize = r.nextDouble(bound);
                    if (prize < MIN) {
                        prize = MIN;
                    }
                }
                // 从money中去掉中奖的金额
                money -= prize;
                count--;
                System.out.println(getName() + "抢到了" + prize + "元");
            }
        }
    }
}
