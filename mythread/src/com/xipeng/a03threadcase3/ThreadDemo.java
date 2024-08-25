package com.xipeng.a03threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
         * 多线程的第三种启动方式：
         * 特点：可以获取到多线程运行的结果
         * 1. 自己定义一个类实现Callable接口
         * 2. 重写里面的call方法
         * 3. 创建MyCallable的对象
         * 4. 创建一个Future的实现类FutureTask对象（作用：管理多线程运行的结果）
         * 5. 创建Thread类对象，并启动线程
         * */

        // 创建MyCallable的对象
        MyCallable mc = new MyCallable();

        // 创建一个Future的实现类FutureTask对象
        FutureTask<Integer> ft = new FutureTask<>(mc);

        // 创建线程的对象
        Thread t1 = new Thread(ft);

        // 启动线程
        t1.start();

        // 获取结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
