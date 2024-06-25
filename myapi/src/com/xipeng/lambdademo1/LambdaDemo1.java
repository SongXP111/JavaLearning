package com.xipeng.lambdademo1;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 4, 6, 5, 7, 9, 8, 10};

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });


        // 1. Lambda表达式可以简化匿名内部类书写
        // 2. Lambda表达式只能简化函数式接口的匿名内部类的写法
        // 3. 函数式接口：有且只有一个抽象方法的接口叫函数式接口，接口上方可以加@FunctionaInterface
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                return o1 - o2;
        });

        System.out.println(Arrays.toString(arr));
    }
}
