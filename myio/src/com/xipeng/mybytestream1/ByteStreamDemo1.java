package com.xipeng.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 字节流

        // 需求：写出一段文字到本地文件中

        // 1. 创建对象
        FileOutputStream fos = new FileOutputStream("/Users/xipengsong/IdeaProjects/Java/myio/src/com/xipeng/files/a.txt");

        // 2. 写出数据
        fos.write(97);

        // 3. 释放资源
        fos.close();
    }
}
