package com.xipeng.StringBuilderDemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("aaa").append("bbb").append("ccc");

        System.out.println(sb);
        String s = sb.toString();
        System.out.println(s);
    }
}
