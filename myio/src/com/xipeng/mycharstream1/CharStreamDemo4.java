package com.xipeng.mycharstream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {
        // 字符流
        // 输出
        // FileWriter

        // 1. 创建对象
        FileWriter fw = new FileWriter("myio/src/com/xipeng/files/b.txt");

        // 2. 输出数据
        fw.write("一二三四");

        fw.flush();

        fw.write("五六七八");

        // 释放资源
        fw.close();

//        fw.write("aaa");
    }
}
