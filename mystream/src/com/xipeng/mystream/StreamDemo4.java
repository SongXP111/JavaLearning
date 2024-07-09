package com.xipeng.mystream;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {
        // 数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 获取Stream流
        Arrays.stream(arr).forEach(s -> System.out.println(s));

        // 引用数据类型
        String[] arr2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Arrays.stream(arr2).forEach(s -> System.out.println(s));
    }
}
