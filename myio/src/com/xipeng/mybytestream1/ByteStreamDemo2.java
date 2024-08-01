package com.xipeng.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 字节流

        // 细节：
        // 1. 创建对象：
        // 参数可以是File对象也可以是字符串表示的路径
        // 如果文件不存在会创建一个新的文件，但是要保证父级路径存在
        // 如果文件已经存在，会清空文件
        // 2. 写数据：
        // write方法的参数是整数，但实际上是对应的ASCII字符
        // 3. 释放资源
        // 每次使用完都要释放资源

        // 1. 创建对象
        FileOutputStream fos = new FileOutputStream("/Users/xipengsong/IdeaProjects/Java/myio/src/com/xipeng/files/a.txt");

        // 2. 写出数据
        fos.write(97);

        // 3. 释放资源
        fos.close();
    }
}
