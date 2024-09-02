package com.xipeng.a10test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        /*
         * 客户端：将本地文件上传到服务器，接收服务器的反馈
         * 服务器：接收客户端上传的文件，上传完毕后给出反馈
         * 并防止文件重名
         * */

        // 1. 创建对象ServerSocket
        ServerSocket ss = new ServerSocket(10000);

        // 2. 监听客户端的连接
        Socket socket = ss.accept();

        // 3. 获取输入流读取数据并保存到本地文件中
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        // 防止文件重名
        String name = UUID.randomUUID().toString().replace("-", "");

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("mysocketprogramming/src/com/xipeng/a10test4/serverdir/" + name + "Ganyu.jpg"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        // 4. 回写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        // 4. 释放资源
        bos.close();
        socket.close();
        ss.close();
    }

}
