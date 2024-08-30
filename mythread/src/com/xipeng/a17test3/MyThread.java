package com.xipeng.a17test3;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    // 共享数据
    // 集合
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    // 线程1和线程2
    static ArrayList<Integer> list1 = new ArrayList<>();
    static ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (list.isEmpty()) {
                    if ("t1".equals(getName())) {
                        System.out.println("抽奖箱1：" + list1);
                    } else if ("t2".equals(getName())) {
                        System.out.println("抽奖箱2：" + list2);
                    }

                    break;
                } else {
                    // 继续抽奖
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    if ("t1".equals(getName())) {
                        list1.add(prize);
                    } else if ("t2".equals(getName())) {
                        list2.add(prize);
                    }
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
