package com.xipeng.myfile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) {
        // 获取

        // 1. length 返回文件的大小（字节数量）
        File f1 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/a.txt");
        System.out.println(f1.length());

        File f2 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/bbb");
        System.out.println(f2.length());

        System.out.println("-----------------");

        // 2. 文件的绝对路径
        File f3 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/a.txt");
        System.out.println(f3.getAbsolutePath());

        File f4 = new File("myfile/src/com/xipeng/myfiles/a.txt");
        System.out.println(f4.getAbsolutePath());

        System.out.println("-----------------");

        // 3. 返回定义文件时使用的路径
        File f5 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/a.txt");
        System.out.println(f5.getAbsolutePath());

        File f6 = new File("myfile/src/com/xipeng/myfiles/a.txt");
        System.out.println(f6.getPath());

        System.out.println("-----------------");

        // 4. 返回文件的名称，带后缀
        // 如果是文件，返回文件名+后缀名
        // 如果是文件夹，返回名字
        File f7 = new File("myfile/src/com/xipeng/myfiles/a.txt");
        System.out.println(f7.getName());

        File f8 = new File("myfile/src/com/xipeng/myfiles/bbb");
        System.out.println(f8.getName());

        System.out.println("-----------------");

        // 5. 文件最后的修改时间
        File f9 = new File("myfile/src/com/xipeng/myfiles/a.txt");
        System.out.println(f9.lastModified());
    }
}
