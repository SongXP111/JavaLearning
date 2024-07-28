package com.xipeng.myfile;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        // 获取当前路径下所有内容
        // 返回一个File数组

        File f = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
