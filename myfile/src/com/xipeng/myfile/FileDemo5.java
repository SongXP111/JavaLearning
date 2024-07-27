package com.xipeng.myfile;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        // 4. 删除文件，空文件夹 delete
        // 不走回收站
        // 如果有内容的文件夹，删除失败
        File f1 = new File("/Users/xipengsong/IdeaProjects/Java/myfile/src/com/xipeng/myfiles/bbb");
        boolean b = f1.delete();
        System.out.println(b);
    }
}
