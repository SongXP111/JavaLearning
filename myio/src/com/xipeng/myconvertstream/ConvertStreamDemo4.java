package com.xipeng.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {
        // 利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
        // 1. 字节流读取中文会乱码，但是字符流可以搞定
        // 2. 字节流里没有读取一整行的方法，但是字符缓冲流可以

//        FileInputStream fis = new FileInputStream("myio/src/com/xipeng/files/a.txt");
//        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//
//        String str = br.readLine();
//        System.out.println(str);

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("myio/src/com/xipeng/files/a.txt")));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
