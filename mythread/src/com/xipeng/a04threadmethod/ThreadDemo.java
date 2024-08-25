package com.xipeng.a04threadmethod;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        * getName
        * SetName
        * 细节：
        * 1. 如果没有给名字，Thread也有默认的名字
        * 2. Thread的构造方法也可以设置名字，但需要重写构造方法调用父类
        *
        * CurrentThread
        * 细节：
        * 当JVM虚拟机启动之后，会自动启动多条线程
        * 其中有一个就是main线程
        * 作用是调用main方法，并执行里面的代码
        *
        * sleep
        * 让线程休眠指定的时间，单位是毫秒，时间到了会继续执行
        * */

        // 1. 创建线程对象
        // 用构造方法设置名字，得重写构造方法
//        MyThread t1 = new MyThread("飞机");
//        MyThread t2 = new MyThread("坦克");
//
//        // 2. 开启线程
//        t1.start();
//        t2.start();

        // 哪条线程执行的这个方法
        // main
//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());

        // sleep
        System.out.println("11111111");
        Thread.sleep(5000);
        System.out.println("22222222");
    }
}
