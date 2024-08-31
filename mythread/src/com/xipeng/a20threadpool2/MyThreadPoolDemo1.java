package com.xipeng.a20threadpool2;

import com.xipeng.a19threadpool1.MyRunnable;

import java.util.concurrent.*;

public class MyThreadPoolDemo1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        * 线程池
        * 1. 核心线程数量
        * 2. 最大线程数
        * 3. 空闲线程最大存活时间
        * 4. 时间单位
        * 5. 任务队列
        * 6. 创建线程工厂
        * 7. 任务的拒绝策略
        * */

        // 1. 获取线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                6,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        // 2. 提交任务

        // 3. 销毁线程池

    }
}
