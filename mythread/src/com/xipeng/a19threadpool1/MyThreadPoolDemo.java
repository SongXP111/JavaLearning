package com.xipeng.a19threadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        * 线程池
        * 有上限和无上限
        * */

        // 1. 获取线程池对象
        ExecutorService pool1 = Executors.newCachedThreadPool();

        // 2. 提交任务
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);


        // 3. 销毁线程池
        pool1.shutdown();
    }
}
