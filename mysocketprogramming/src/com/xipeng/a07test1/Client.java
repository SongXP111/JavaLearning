package com.xipeng.a07test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
         * 客户端：多次发送数据
         * 服务器：接收多次数据，并打印
         * */

        // 1. 创建Socket对象并链接服务端
        Socket socket = new Socket("127.0.0.1", 10000);

        // 2. 可以从链接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        // 写出数据
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您要发送到信息");
            String line = scanner.nextLine();
            if (line.equals("886")) {
                break;
            }
            os.write(line.getBytes());
            os.write("\r\n".getBytes());
        }

        // 3. 释放资源
        os.close();
        socket.close();
    }
}
