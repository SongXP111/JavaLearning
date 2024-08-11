package com.xipeng.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 字符缓冲输入流
        // 特有方法：readLine

        // 1. 创建缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("myio/src/com/xipeng/files/a.txt"));

        // 2. 读取数据
        while (((br.readLine()) != null)) {
            System.out.println(br.readLine());
        }

        // 3. 释放资源
        br.close();
    }
}
