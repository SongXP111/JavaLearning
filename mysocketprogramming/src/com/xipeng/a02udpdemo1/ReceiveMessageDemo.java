package com.xipeng.a02udpdemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        // 接收数据

        // 1. 创建DatagramSocket对象（快递公司）
        // 细节：
        // 接收的时候一定要绑定端口，且必须和发送的端口一致
        DatagramSocket ds = new DatagramSocket(10086);

        // 2. 接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);

        // 3. 解析数据包
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println("接收到数据:" + new String(data, 0, len));
        System.out.println("该数据是从" + address + ":" + port + "发出的");

        // 4. 释放资源
        ds.close();
    }
}
