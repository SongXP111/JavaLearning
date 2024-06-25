package com.xipeng.StringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
        // 创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "Abc";

        // 用==比较
        // 基本数据类型：比的是数据值
        // 引用数据类型：比的是地址值
        System.out.println(s1 == s2);

        // 用equals比较
        System.out.println(s1.equals(s2));

        // 忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
