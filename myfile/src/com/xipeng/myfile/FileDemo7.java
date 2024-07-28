package com.xipeng.myfile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo7 {
    public static void main(String[] args) {
        // 获取并遍历

        // 1. listRoots 获取系统中所有的盘符
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        // 2. list() 获取当前路径下的所有内容（仅名字）
        File f1 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles");
        String[] arr2 = f1.list();
        System.out.println(Arrays.toString(arr2));

        // 3. list(FilenameFilter filter) 利用文件名过滤器
        File f2 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles");
        String[] arr3 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // dir: 父级路径
                // name：子级路径
                // 如果true，保留，否则舍弃
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
//                System.out.println(src);
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
