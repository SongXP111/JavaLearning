package com.xipeng.mytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        // 需求：
        // 为保证文件的安全性，对原始文件进行加密，在使用的时候对其解密
        // 加密原理：对原始文件中的每一个字节数据进行更改，然后将更改过后的数据储存到新的文件中
        // 解密原理：读取加密之后的文件，按照加密的规则反向操作，变成原始文件

        // 异或：^
        // 两边相同：false
        // 两边不同：true

        // a - b：加密
        // b - c：解密
        FileInputStream fis = new FileInputStream("myio/src/com/xipeng/files/b.txt");
        FileOutputStream fos = new FileOutputStream("myio/src/com/xipeng/files/c.txt");

        // 加密
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ 2);
        }

        fis.close();
        fos.close();
    }

}
