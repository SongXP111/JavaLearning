package com.xipeng.myfile;

import java.io.File;

public class FilePractice {
    public static void main(String[] args) {
        // 找到avi结尾的文件，考虑子文件夹
        File f = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles");
        findAVI(f);
    }

    public static void findAVI(File src) {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                if (file.getName().endsWith(".avi")) {
                    System.out.println(file);
                }
            } else {
                findAVI(file);
            }
        }
    }
}
