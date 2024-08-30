package com.xipeng.a15test1;

public class Test1 {
    public static void main(String[] args) {
        /*
        * 微信抢红包
        * 100块钱，分成3个包，5个人去抢
        *
        * */

        // 创建线程对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();

        // 设置名字
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");
        t5.setName("t5");

        // 启动
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
