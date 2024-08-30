package com.xipeng.a16test2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        /*
        * 创建两个抽奖箱，并随机抽取
        * */

        // 创建奖池
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10,5,20,50,100,200,500,800,2,80,300,700);

        // 创建线程
        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);

        t1.start();
        t2.start();

    }
}
