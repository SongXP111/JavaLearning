package com.xipeng.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 循环读取数据

        // FileInputStream
        FileInputStream fis = new FileInputStream("myio/src/com/xipeng/files/a.txt");

        // 读数据
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }


        // 释放资源
        fis.close();
    }
}
