package com.xipeng.mycommonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        // FileUtils

        // copyFile
//        File src = new File("myio/src/com/xipeng/mycommonsio/a.txt");
//        File dest = new File("myio/src/com/xipeng/mycommonsio/copy.txt");
//        FileUtils.copyFile(src, dest);

        // copyDirectory
//        File src = new File("myio/src/com/xipeng/mycommonsio/aaa");
//        File dest = new File("myio/src/com/xipeng/mycommonsio/aaacopy");
//        FileUtils.copyDirectory(src, dest);

        // copyDirectoryToDirectory
        // copy到文件夹里
//        File src = new File("myio/src/com/xipeng/mycommonsio/aaa");
//        File dest = new File("myio/src/com/xipeng/mycommonsio/aaacopy");
//        FileUtils.copyDirectoryToDirectory(src, dest);

        // deleteDirectory：删除文件夹
        // cleanDirectory：清空文件夹但保留文件夹
        File src = new File("myio/src/com/xipeng/mycommonsio/aaa");
        FileUtils.deleteDirectory(src);
        FileUtils.cleanDirectory(src);
    }
}
