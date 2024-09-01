package com.xipeng.a20threadpool2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolDemo2 {
    public static void main(String[] args) throws InterruptedException {
        // 向Java虚拟机返回可用的处理器数目
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
