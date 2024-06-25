package com.xipeng.StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        // 直接赋值
        String s1 = "ABC";
        System.out.println("s1: " + s1);

        // new
        // 空参
        String s2 = new String();
        System.out.println("s2: " + s2);

        //
        String s3 = new String("ABC");
        System.out.println("s3: " + s3);

        // 字符数组
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println("s4: " + s4);
    }
}
