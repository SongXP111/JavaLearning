package com.xipeng.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 将本地文件的GBK文件转成UTF-8

        // 1. JDK11以前的方案
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("myio/src/com/xipeng/files/a.txt"), StandardCharsets.UTF_8);
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myio/src/com/xipeng/files/b.txt"), "GBK");
//
//        int b;
//        while ((b = isr.read()) != -1) {
//            osw.write(b);
//        }
//
//        osw.close();
//        isr.close();

        // 2. 代替方案
        FileReader fr = new FileReader("myio/src/com/xipeng/files/a.txt", StandardCharsets.UTF_8);
        FileWriter fw = new FileWriter("myio/src/com/xipeng/files/b.txt", Charset.forName("GBK"));
        int b;
        while ((b = fr.read()) != -1) {
            fw.write(b);
        }
        fr.close();
        fw.close();
    }
}
