package com.xipeng.a08test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        /*
         * 客户端：发送一条数据，接收服务端的消息并打印
         * 服务器：接收数据并打印，再给客户端反馈信息
         * */

        // 1. 创建对象ServerSocket
        ServerSocket ss = new ServerSocket(10000);

        // 2. 监听客户端的连接
        Socket socket = ss.accept();

        // 3. 获取输入流读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        //
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }

        // 4. 回写数据
        String str = "在！";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        // 4. 释放资源
        socket.close();
        ss.close();

    }

}
