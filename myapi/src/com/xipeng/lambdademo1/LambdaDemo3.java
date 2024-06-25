package com.xipeng.lambdademo1;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        // lambda省略
        Integer[] arr = {2, 3, 1, 4, 6, 5, 7, 9, 8, 10};

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });


        // 完整格式
//        Arrays.sort(arr, (Integer o1, Integer o2) -> {
//            return o1 - o2;
//        });

        // 省略格式
        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        System.out.println(Arrays.toString(arr));
    }
}
