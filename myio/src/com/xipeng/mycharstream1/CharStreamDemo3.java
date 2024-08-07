package com.xipeng.mycharstream1;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 字符流
        // 输出
        // FileWriter

        // 1. 创建对象
        FileWriter fw = new FileWriter("myio/src/com/xipeng/files/b.txt", true);

        // 2. 输出数据
        fw.write("甘雨");

        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', '我'};
        fw.write(chars);

        // 释放资源
        fw.close();
    }
}
