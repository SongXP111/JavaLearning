package com.xipeng.mycharset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 编码
        // 默认：getBytes()
        // 指定：getBytes(String charsetName)
        // 解码
        // 默认：String(byte[] bytes)
        // 指定：String(byte[] bytes, String charsetName)

        // 编码
        String str = "甘雨ai";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        // 解码
        String str2 = new String(bytes1);
        System.out.println(str2);

        String str3 = new String(bytes1, "GBK"); // 乱码
        System.out.println(str3);

        String str4 = new String(bytes2, "GBK");
        System.out.println(str4);
    }
}
