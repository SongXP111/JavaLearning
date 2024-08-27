package com.xipeng.a10threadsafe2;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        * 需求：目前电影院正在上映大片，共100张票，分3个窗口售卖，设计一个程序模仿该情况
        * 利用同步方法完成
        * */


        // 创建参数对象
        MyRunnable mr = new MyRunnable();

        // 创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
