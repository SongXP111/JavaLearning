package com.xipeng.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        // distinct 去重
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "甘雨", "芙宁娜", "八重神子", "克洛琳德", "雷电将军", "刻晴", "刻晴", "刻晴");

//        list1.stream().distinct().forEach(System.out::println);

        // concat 合并
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "娜维娅", "胡桃");
        Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);
    }
}
