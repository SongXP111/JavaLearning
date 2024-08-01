package com.xipeng.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 读取数据

        // FileInputStream
        FileInputStream fis = new FileInputStream("myio/src/com/xipeng/files/b.txt");

        // 读数据
        // 一次读一个字节，读出来的是ASCII对应的数字
        // 如果读到了文件末尾，返回-1
        int b1 = fis.read();


        // 释放资源
        fis.close();
    }
}
