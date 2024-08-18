package com.xipeng.myprintstream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 字符打印流

        // 1. 创建对象
        PrintWriter pw = new PrintWriter(new FileWriter("myio/src/com/xipeng/myprintstream/a.txt"), true);

        // 2. 写出数据
        pw.println(97);
        pw.print(true);
        pw.println();
        pw.printf("%s爱上了%s", "阿珍", "阿强");

        // 3. 释放资源
        pw.close();
    }
}
