package com.xipeng.a11test5;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
         * 客户端：将本地文件上传到服务器，接收服务器的反馈
         * 服务器：接收客户端上传的文件，上传完毕后给出反馈
         * 使用多线程接收多个用户上传的文件
         * */

        // 1. 创建Socket对象并链接服务端
        Socket socket = new Socket("127.0.0.1", 10000);


        // 2. 读取本地文件并写到服务器中
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("mysocketprogramming/src/com/xipeng/a11test5/clientdir/Ganyu.jpg"));

        // 3. 可以从链接通道中获取输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        // 写出数据
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
            bos.flush(); // 必须有
        }

        // 写出结束标记
        socket.shutdownOutput();

        // 4. 接收服务端的回写数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);

        // 5. 释放资源
        bos.close();
        socket.close();
    }
}
