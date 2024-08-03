package com.xipeng.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo7 {
    public static void main(String[] args) throws IOException {
        // try catch finally

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // FileInputStream
            fis = new FileInputStream("myio/src/com/xipeng/files/test/movie.mp4");
            fos = new FileOutputStream("myio/src/com/xipeng/files/a.txt");

            // 拷贝
            // 边读边写
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
