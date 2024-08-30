package com.xipeng.a18test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        * 创建两个抽奖箱
        * 抽的时候不打印，抽完了统一打印
        * */

        // 创建奖池
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10,5,20,50,100,200,500,800,2,80,300,700);

        // 创建线程
        MyCallable mc = new MyCallable(list);

        //
        FutureTask<Integer> ft1 = new FutureTask<>(mc);
        FutureTask<Integer> ft2 = new FutureTask<>(mc);


        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

        Integer max1 = ft1.get();
        System.out.println("max1:" + max1);
        Integer max2 = ft2.get();
        System.out.println("max2:" + max2);

    }
}
