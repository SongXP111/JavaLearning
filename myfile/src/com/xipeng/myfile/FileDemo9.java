package com.xipeng.myfile;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo9 {
    public static void main(String[] args) {
        // listFiles(FileFilter filter)

//        File f = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles");
//        File[] files = f.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isFile() && pathname.getName().endsWith(".txt");
//            }
//        });
//        for (File file : files) {
//            System.out.println(file.getName());
//        }

        // listFiles(FilenameFilter filter)
        File f = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles");
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && src.getName().endsWith(".txt");
            }
        });
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
