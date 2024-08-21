package com.xipeng.myhutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        // file
        File file = FileUtil.file("/Users/xipengsong/IdeaProjects/Java/myio/src/com/xipeng/myhutool", "aaa", "a.txt");
        System.out.println(file);

        // touch
        File touch = FileUtil.touch(file);
        System.out.println(touch);

        // writeLines
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        File file2 = FileUtil.writeLines(list, "/Users/xipengsong/IdeaProjects/Java/myio/src/com/xipeng/myhutool/a.txt", "UTF-8");
        System.out.println(file2);

        // appendLines
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ddd");
        list2.add("eee");
        list2.add("fff");
        File file3 = FileUtil.appendLines(list2, "/Users/xipengsong/IdeaProjects/Java/myio/src/com/xipeng/myhutool/a.txt", "UTF-8");
        System.out.println(file3);

        // readLines
        List<String> list3 = FileUtil.readLines("/Users/xipengsong/IdeaProjects/Java/myio/src/com/xipeng/myhutool/a.txt", "UTF-8");
        System.out.println(list3);
    }
}
