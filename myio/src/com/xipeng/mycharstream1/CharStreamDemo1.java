package com.xipeng.mycharstream1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 字符流
        // FileReader

        // 1. 创建对象并关联本地文件
        FileReader fr = new FileReader("myio/src/com/xipeng/files/a.txt");

        // 2. 读取数据 read
        // 字符流的底层也是字节流
        // 在读取之后，方法的底层还会进行解码并转成十进制
        // ch都是十进制数据
        // 想看到内容需要强转
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        // 释放资源
        fr.close();
    }
}
