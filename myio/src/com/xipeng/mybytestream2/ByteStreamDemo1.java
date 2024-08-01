package com.xipeng.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 读取数据

        // FileInputStream
        FileInputStream fis = new FileInputStream("myio/src/com/xipeng/files/a.txt");

        // 读数据
        int b1 = fis.read();
        System.out.println((char) b1);

        int b2 = fis.read();
        System.out.println(b2);

        int b3 = fis.read();
        System.out.println(b3);

        int b4 = fis.read();
        System.out.println(b4);

        int b5 = fis.read();
        System.out.println(b5);

        // 释放资源
        fis.close();
    }
}
