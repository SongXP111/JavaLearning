package com.xipeng.a06tcpdemo2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // TCP协议，发送数据

        // 1. 创建Socket对象
        // 细节：在创建对象的时候会链接服务端
        // 如果链接不上，代码会报错
        Socket socket = new Socket("127.0.0.1", 10000);

        // 2. 可以从链接通道中获取输出流
        OutputStream outputStream = socket.getOutputStream();
        // 写出数据
        // 不能写中文(需要字符流)
        outputStream.write("你好你好".getBytes());

        // 3. 释放资源
        outputStream.close();
        socket.close();
    }
}
