package com.xipeng.myfile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        // File对象构造方法

        // 1. 根据字符串中表示的路径，变成File对象
        // String
        String str = "/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/a.txt";
        File file1 = new File(str);
        System.out.println(file1);

        // 2. 父级路径
        //    子级路径
        // String, String
        String parent = "/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles";
        String child = "a.txt";
        File file2 = new File(parent, child);
        System.out.println(file2);

        // 3. File, String
        File parent2 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles");
        String child2 = "a.txt";
        File file3 = new File(parent2, child2);
        System.out.println(file3);
    }
}
