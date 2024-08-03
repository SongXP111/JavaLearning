package com.xipeng.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo8 {
    public static void main(String[] args) throws IOException {
        // try catch finally
        // AutoCloseable
        // JDK7
        // try(创建对象的代码) {}
        // 对象类必须实现AutoCloseable接口

        try (FileInputStream fis = new FileInputStream("myio/src/com/xipeng/files/test/movie.mp4");
             FileOutputStream fos = new FileOutputStream("myio/src/com/xipeng/files/a.txt")) {
            // 拷贝
            // 边读边写
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
