package com.xipeng.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        // 字符缓冲输出流
        // 特有方法：newLine

        // 1. 创建缓冲流对象
        // 如果没有文件，会自动创建
        // 如果有文件，会自动清空
        // 父级路径必须正确
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio/src/com/xipeng/files/b.txt"));
        // 2. 读取数据
        bw.write("8月10日星期六");
        bw.newLine();
        bw.write("今天出去玩");

        // 3. 释放资源
        bw.close();
    }
}
