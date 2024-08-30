package com.xipeng.a17test3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        /*
        * 创建两个抽奖箱
        * 抽的时候不打印，抽完了统一打印
        * */

        // 创建奖池
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10,5,20,50,100,200,500,800,2,80,300,700);

        // 创建线程
        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

    }
}
