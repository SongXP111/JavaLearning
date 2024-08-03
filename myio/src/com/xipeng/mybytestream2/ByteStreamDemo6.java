package com.xipeng.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        // 拷贝文件
        // 大型文件

        long start = System.currentTimeMillis();

        // FileInputStream
        FileInputStream fis = new FileInputStream("myio/src/com/xipeng/files/test/movie.mp4");
        FileOutputStream fos = new FileOutputStream("myio/src/com/xipeng/files/a.txt");

        // 拷贝
        // 边读边写
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        // 释放资源
        fis.close();
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start); // 运行时间
    }
}
