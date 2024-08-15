package com.xipeng.myconvertstream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 转换流的作用
        // 1. 指定字符集读写数据（JDK11之后被淘汰）
        // 2. 字节流想使用字符流中的方法

        // 利用转换流按照指定字符编码读取数据

        // 1. 创建对象并指定字符编码
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("myio/src/com/xipeng/files/a.txt"), StandardCharsets.UTF_8);
//
//        // 2. 读取数据
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }
//
//        // 3. 释放资源
//        isr.close();

        // JDK11之后的替代方案：
        FileReader fr = new FileReader("myio/src/com/xipeng/files/a.txt", StandardCharsets.UTF_8);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        // 3. 释放资源
        fr.close();
    }
}
