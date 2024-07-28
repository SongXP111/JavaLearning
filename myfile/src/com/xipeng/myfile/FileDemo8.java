package com.xipeng.myfile;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        // listFiles()

        // 打印所有txt文件
        File f = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles");
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file);
            }
        }
    }
}
