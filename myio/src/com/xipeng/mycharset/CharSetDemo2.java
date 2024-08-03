package com.xipeng.mycharset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharSetDemo2 {
    public static void main(String[] args) throws IOException {
        // 字节流读取中文会出现乱码

        // FileInputStream
        FileInputStream fis = new FileInputStream("myio/src/com/xipeng/files/b.txt");
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
