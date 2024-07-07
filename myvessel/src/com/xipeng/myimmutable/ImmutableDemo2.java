package com.xipeng.myimmutable;

import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        // 不可变set
        // 不可重复
        Set<String> set = Set.of("张三", "李四");

        for (String s : set) {
            System.out.println(s);
        }

        // 报错
//        set.remove("张三");
    }
}
