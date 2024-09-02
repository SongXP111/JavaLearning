package com.xipeng.a02udpdemo1;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        // 发送数据

        // 1. 创建DatagramSocket对象（快递公司）
        // 细节：
        // 绑定端口：通过这个端口往外发送
        // 空参：随机端口
        // 有参：绑定端口
        DatagramSocket ds = new DatagramSocket();

        // 2. 打包数据
        String str = "你好呀！！！";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        // 3. 发送数据
        ds.send(dp);

        // 释放资源
        ds.close();
    }
}
