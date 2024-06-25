package com.xipeng.StringBuilderDemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("aaa");
        sb.append("bbb");

        System.out.println(sb);
        String s = sb.toString();
        System.out.println(s);
    }
}
