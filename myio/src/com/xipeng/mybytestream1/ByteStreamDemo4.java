package com.xipeng.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        // 换行写
        // 续写

        FileOutputStream fos = new FileOutputStream("myio/src/com/xipeng/files/a.txt", true/*续写开关*/);

        // 写出数据
        String str1 = "ganyulaopo\r";
        byte[] bytes = str1.getBytes();
        fos.write(bytes);

        // 换行符
//        String wrap = "\r";
//        fos.write(wrap.getBytes());

        String str2 = "666\r";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);

        // 释放资源
        fos.close();
    }
}
