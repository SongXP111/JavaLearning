package com.xipeng.a11test5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        /*
         * 客户端：将本地文件上传到服务器，接收服务器的反馈
         * 服务器：接收客户端上传的文件，上传完毕后给出反馈
         * 使用多线程接收多个用户上传的文件
         * */

        // 创建线程池对象优化
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        // 1. 创建对象ServerSocket
        ServerSocket ss = new ServerSocket(10000);

        // 2. 监听客户端的连接
        while (true) {
            Socket socket = ss.accept();

            // 开启一个线程
//            new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));
        }
    }

}
