package com.xipeng.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {
        // map 类型转化
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "甘雨-1", "芙宁娜-2", "八重神子-3", "克洛琳德-4", "雷电将军-5", "刻晴-6");

        // String -> int
        // apply的形参：原本的类型，之后的类型
//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String ageString = s.split("-")[1];
//                return Integer.parseInt(ageString);
//            }
//        }).forEach(System.out::println);

        // lambda
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(System.out::println);
    }
}
