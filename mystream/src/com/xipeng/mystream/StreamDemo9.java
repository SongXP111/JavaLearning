package com.xipeng.mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "甘雨-1", "芙宁娜-2", "八重神子-3", "克洛琳德-4", "雷电将军-5", "刻晴-6");

        // forEach 遍历
//        list.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // lambda
//        list.stream().forEach(s -> System.out.println(s));

        // count 统计
//        long count = list.stream().count();
//        System.out.println(count);

        // toArray 收集,放到数组中
        // IntFunction的泛型：具体类型的数组
        // apply的形参：流中数据的个数，要跟数组长度保持一致
        // apply的返回值：具体类型的数组

        // toArray方法参数的作用：创造一个指定类型的数组
        // toArray方法的底层：会得到流里面每一个数据，并把数据放到数组中
        // 返回值：一个装有流中所有数据的数组
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        String[] arr2 = list.stream().toArray(value -> new String[value]);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
