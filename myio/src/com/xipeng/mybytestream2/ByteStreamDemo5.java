package com.xipeng.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        // 一次读取多个字节
        // read(byte[] buffer)

        // FileInputStream
        FileInputStream fis = new FileInputStream("myio/src/com/xipeng/files/test/movie.mp4");

        // 读取数据
        byte[] bytes = new byte[2];
        // 一次读取多个字节数据，具体读多少，跟数组长度有关
        // 返回值：本次读取了多少个字节
        int len = fis.read(bytes);
        System.out.println(len);

        String str = new String(bytes, 0, len);
        System.out.println(str);

        // 释放资源
        fis.close();
    }
}
