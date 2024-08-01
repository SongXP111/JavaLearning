package com.xipeng.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 字节流
        // 三种写数据的方式

        FileOutputStream fos = new FileOutputStream("/Users/xipengsong/IdeaProjects/Java/myio/src/com/xipeng/files/a.txt");

        // 1. write(int b)
//        fos.write(97); // a
//        fos.write(98); // b

        // 2. write(byte[] b)
        byte[] bytes = {97, 98, 99, 100, 101}; // abcde
//        fos.write(bytes);

        // 3. write(byte[] b, int off, int len)
        // off：起始索引
        // len：个数
        fos.write(bytes, 1, 2); // bc

        // 释放资源
        fos.close();
    }
}
