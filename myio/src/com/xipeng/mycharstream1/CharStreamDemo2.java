package com.xipeng.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 字符流
        // FileReader

        // 1. 创建对象并关联本地文件
        FileReader fr = new FileReader("myio/src/com/xipeng/files/a.txt");

        // 2. 读取数据
        char[] chars = new char[2];
        int len;
        // read(chars)：读取数据，解码，强转，三步合并了，把强转之后的字符放到数组当中
        while ((len = fr.read(chars)) != -1) {
            // 把数组中的数据变成字符串再打印
            System.out.println(new String(chars, 0, len));
        }

        // 释放资源
        fr.close();
    }
}
