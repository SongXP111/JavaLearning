package com.xipeng.mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "甘雨-女-1", "芙宁娜-女-2", "胡桃-女-2", "八重神子-女-3", "克洛琳德-女-4", "雷电将军-女-5", "刻晴-女-6");

        // collect到List
        List<String> newList = list.stream()
                .filter(s -> Objects.equals(s.split("-")[1], "女"))
                .collect(Collectors.toList());

        System.out.println(newList);


        // collect到Set
        Set<String> newSet = list.stream()
                .filter(s -> Objects.equals(s.split("-")[1], "女"))
                .collect(Collectors.toSet());

        System.out.println(newSet);


        // collect到Map
        // key：姓名，value：数字
        // 注意：Map中key不能重复

        // 参数1：key的生成规则
        // Function 泛型1:表示流中每个数据的类型，泛型2:表示Map中key的数据类型
        // apply形参：表示流中的每个数据
        // 方法体：生成key的代码
        // 返回值：已经生成的key

        // 参数2:value的生成规则
        // Function 泛型1:表示流中每个数据的类型，泛型2:表示Map中value的数据类型
        // apply形参：表示流中的每个数据
        // 方法体：生成value的代码
        // 返回值：已经生成的value
        Map<String, Integer> map = list.stream()
                .filter(s -> Objects.equals(s.split("-")[1], "女"))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        String value = s.split("-")[2];
                        return Integer.parseInt(value);
                    }
                }));
        System.out.println(map);

        // 简化
        Map<String, Integer> map2 = list.stream()
                .filter(s -> Objects.equals(s.split("-")[1], "女"))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));
        System.out.println(map2);
    }
}
