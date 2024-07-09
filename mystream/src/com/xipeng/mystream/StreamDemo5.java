package com.xipeng.mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        // 零散数据
        Stream.of(1,2,3,4,5, "String", 1.1).forEach(s -> System.out.println(s));

        // of传递的数组必须传递引用数据类型
        // 如果传递基本数据类型，会把整体当作一个元素放到Stream中
        int[] arr = {1,2,3,4,5};
        Stream.of(arr).forEach(System.out::println); // 地址值
    }
}
