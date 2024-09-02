package com.xipeng.a03udpdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        // 发送数据
        // 键盘录入，直到输入的数据是886，发送数据结束

        // 1. 创建DatagramSocket对象（快递公司）
        // 细节：
        // 绑定端口：通过这个端口往外发送
        // 空参：随机端口
        // 有参：绑定端口
        DatagramSocket ds = new DatagramSocket();

        // 2. 打包数据
        Scanner sc = new Scanner(System.in);
        DatagramPacket dp = null;
        while (true) {
            System.out.println("请输入您要说的话：");
            String str = sc.nextLine();
            if (str.equals("886")) {
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;

            dp = new DatagramPacket(bytes, bytes.length, address, port);

            // 3. 发送数据
            ds.send(dp);
        }



        // 释放资源
        ds.close();
    }
}
