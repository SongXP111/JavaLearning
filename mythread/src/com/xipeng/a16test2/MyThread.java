package com.xipeng.a16test2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    // 共享数据
    // 集合
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (list.isEmpty()) {
                    break;
                } else {
                    // 继续抽奖
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    System.out.println(getName() + "又产生了一个" + prize + "元的大奖");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
