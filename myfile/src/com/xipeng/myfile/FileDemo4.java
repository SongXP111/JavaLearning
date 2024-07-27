package com.xipeng.myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        // File的创建和删除

        // 1. 创建一个空的文件夹 createNewFile
        // 如果当前路径表示的文件不存在，则创建成功，方法返回true，如果存在则创建失败，返回false
        // 如果父级路径不存在，那么方法会有异常，IOException
        // 创建的一定是文件，如果没有后缀，会创建一个没有后缀的文件
//        File f1 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/c.txt");
//        boolean b = f1.createNewFile();
//        System.out.println(b);

        // 2. 创建单极文件夹 mkdir
        // 如果文件夹的名字和文件重名，创建失败
        // 无法创建多级文件夹
//        File f2 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/ddd");
//        boolean b = f2.mkdir();
//        System.out.println(b);


        // 3. 创建多极文件夹 mkdirs
        // 也能创建多级文件夹（底层是mkdir）
        File f3 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/ddd/aaa/bbb/ccc");
        boolean b = f3.mkdirs();
        System.out.println(b);



    }
}
