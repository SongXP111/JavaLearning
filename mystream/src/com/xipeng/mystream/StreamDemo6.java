package com.xipeng.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {
        // filter 过滤
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "甘雨", "芙宁娜", "八重神子", "克洛琳德", "雷电将军", "刻晴");

        // 留下名字长度为2的角色
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                // 如果为true留下，false舍弃
//                return s.length() == 2;
//            }
//        }).forEach(System.out::println);

//        list.stream().filter(s -> s.length() == 2).forEach(System.out::println);

        // limit 获取
        list.stream().limit(4).forEach(System.out::println);
        // skip 跳过
        list.stream().skip(2).forEach(System.out::println);
    }
}
