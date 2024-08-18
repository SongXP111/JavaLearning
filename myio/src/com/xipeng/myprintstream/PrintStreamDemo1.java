package com.xipeng.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // 字节打印流

        // 1. 创建对象
        PrintStream ps = new PrintStream(new FileOutputStream("myio/src/com/xipeng/myprintstream/a.txt"), true, StandardCharsets.UTF_8);

        // 2. 写出数据
        ps.println(97);
        ps.print(true);
        ps.println();
        ps.printf("%s爱上了%s", "阿珍", "阿强");

        // 3. 释放资源
        ps.close();
    }
}
