package com.xipeng.mytest;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 需求：拷贝一个文件夹，考虑子文件夹

        // 1. 创建对象
        File src = new File("myio/src/com/xipeng/files/src");
        File dest = new File("myio/src/com/xipeng/files/dest");

        copydir(src, dest);
    }

    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        // 递归
        // 1. 进度数据源
        // 2. 遍历数组
        // 3. 判断文件
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                // 文件，拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                byte[] b = new byte[1024];
                int len;
                while ((len = fis.read(b)) != -1) {
                    fos.write(b, 0, len);
                }
                fos.close();
                fis.close();
            } else {
                // 文件夹，递归
                copydir(file, new File(dest, file.getName()));
            }
        }
    }
}
