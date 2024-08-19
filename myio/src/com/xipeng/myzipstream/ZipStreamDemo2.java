package com.xipeng.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 压缩流
        // 需求：把a.txt变成一个压缩包

        // 1. 创建File对象表示要压缩的文件
        File src = new File("myio/src/com/xipeng/myzipstream/zip/a.txt");

        // 2. 创建File对象压缩包的位置
        File dest = new File("myio/src/com/xipeng/myzipstream");

        // 3. 调用方法
        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        // 1. 创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));

        // 2. 创建ZipEntry对象，表示压缩包里的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("a.txt");

        // 3. 放到压缩包当中
        zos.putNextEntry(entry);

        // 4. 把src文件中的数据写到压缩包中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }

        zos.closeEntry();
        zos.close();
    }
}
