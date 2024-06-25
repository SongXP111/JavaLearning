package com.xipeng.StringBuilderDemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        // 链式编程
        // 一个方法的结果可以继续调用其他方法
        String s = "abc";
        int len = s.substring(0,2).length();
        System.out.println(len);
    }
}
