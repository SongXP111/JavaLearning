package com.xipeng.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 利用转换流按照指定字符编码写出数据

        // 1. 创建对象并指定字符编码
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myio/src/com/xipeng/files/b.txt"), StandardCharsets.UTF_8);
//
//        // 2. 写出数据
//        osw.write("你好你好");
//
//        // 3. 释放资源
//        osw.close();

        FileWriter fw = new FileWriter("myio/src/com/xipeng/files/b.txt", StandardCharsets.UTF_8);
        fw.write("你好你好");
        fw.close();
    }
}
