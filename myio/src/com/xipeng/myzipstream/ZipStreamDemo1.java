package com.xipeng.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 压缩流

        // 1. 创建一个File表示要解压的压缩包
        File src = new File("myio/src/com/xipeng/myzipstream/zip.zip");

        // 2. 创建一个File表示解压的目的地
        File dest = new File("myio/src/com/xipeng/myzipstream/dest");

        // 3. 调用方法
        unzip(src, dest);
    }

    // 定义一个解压方法
    public static void unzip(File src, File dest) throws IOException {
        // 创建一个解压缩流来读取数据
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));

        // 获取压缩包里每个zipentry对象
        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) {
            if (entry.getName().startsWith("__MACOSX")) {
                continue;
            }
            if (entry.isDirectory()) {
                // 文件夹：需要在dest处创建一个同样的文件夹
                File file = new File(dest, entry.toString());
                file.mkdirs();
            } else {
                // 文件：读取并存放到目的地（按照层级目录存放)
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zis.read()) != -1) {
                    // 写到目的地
                    fos.write(b);
                }
                fos.close();
                zis.closeEntry();
            }

        }
        zis.close();
    }
}
