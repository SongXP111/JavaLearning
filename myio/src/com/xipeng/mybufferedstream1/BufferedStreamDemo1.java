package com.xipeng.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 需求：
        // 利用字节缓冲流拷贝文件

        // 1. 创建缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio/src/com/xipeng/files/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio/src/com/xipeng/files/b.txt"));

        // 2. 循环读取并写到目的地
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        // 3. 释放资源
        bis.close();
        bos.close();
    }
}
