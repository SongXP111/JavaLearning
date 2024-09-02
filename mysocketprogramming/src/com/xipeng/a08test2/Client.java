package com.xipeng.a08test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
         * 客户端：发送一条数据，接收服务端的消息并打印
         * 服务器：接收数据并打印，再给客户端反馈信息
         * */

        // 1. 创建Socket对象并链接服务端
        Socket socket = new Socket("127.0.0.1", 10000);

        // 2. 可以从链接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        // 写出数据
        String str = "在吗？";
        os.write(str.getBytes());

        // 写出结束标记
        socket.shutdownOutput();

        // 3. 接收服务端的回写数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }


        // 3. 释放资源
        os.close();
        socket.close();
    }
}
