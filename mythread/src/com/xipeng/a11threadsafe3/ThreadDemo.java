package com.xipeng.a11threadsafe3;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        * 需求：目前电影院正在上映大片，共100张票，分3个窗口售卖，设计一个程序模仿该情况
        * 利用Lock
        * */

        // 创建线程对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // 起名字
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
