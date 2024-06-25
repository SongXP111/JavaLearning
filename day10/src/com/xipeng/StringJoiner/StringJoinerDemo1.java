package com.xipeng.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        // 1. 间隔符号
        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("aaa").add("bbb").add("ccc");
        System.out.println(sj1);

        // 2. 开始符号，间隔符号，结束符号
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("aaa").add("bbb").add("ccc");
        System.out.println(sj2);
    }
}
