package com.xipeng.lambdademo1;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo4 {
    public static void main(String[] args) {
        // 用sort的方法进行排序
        // 短的在前面
        String[] arr = {"a", "aaaa", "aaa", "aa"};

//        Arrays.sort(arr, new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
