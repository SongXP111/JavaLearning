package com.xipeng.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        // 拷贝文件

        // FileInputStream
        FileInputStream fis = new FileInputStream("myio/src/com/xipeng/files/test/movie.mp4");
        FileOutputStream fos = new FileOutputStream("myio/src/com/xipeng/files/a.txt");

        // 拷贝
        // 边读边写
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        // 释放资源
        fis.close();
        fos.close();
    }
}
