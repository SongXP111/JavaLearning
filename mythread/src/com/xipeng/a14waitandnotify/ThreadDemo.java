package com.xipeng.a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        * 需求：利用阻塞队列完成生产者和消费者的代码
        * 细节：必须使用同一个阻塞队列
        * */

        // 1. 创建阻塞队列
        // 可以把阻塞队列的对象传给生产者和消费者
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        // 2. 创建线程对象
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        // 3. 启动
        c.start();
        f.start();

        /*
        * 数据错落，因为打印在put和take外面，而put和take是上锁的
        * */
    }
}
