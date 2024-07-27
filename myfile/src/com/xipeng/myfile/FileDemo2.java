package com.xipeng.myfile;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        // 判断

        // 1. 对一个文件的路径进行判断
        File f1 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/a.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println("-----------------");

        // 2. 对一个文件夹的路径进行判断
        File f2 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/bbb");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());
        System.out.println("-----------------");

        // 3. 对一个不存在的路径进行判断
        File f3 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/ddd");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());
    }
}
