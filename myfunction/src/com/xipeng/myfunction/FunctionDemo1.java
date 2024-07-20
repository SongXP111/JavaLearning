package com.xipeng.myfunction;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        // 创建一个数组，倒序排列
        Integer[] arr = {3, 6, 5, 2, 3, 5, 4, 6, 10};

        // 匿名内部类
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

        // lambda（Comparator是函数式接口）
//        Arrays.sort(arr, (o1, o2) -> o2 - o1);


        // 方法引用
        // 1. 引用处需要是函数式接口
        // 2. 被引用的方法需要已经存在
        // 3. 被引用的方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        // 4. 功能满足当前要求
        Arrays.sort(arr, FunctionDemo1::subtraction);

        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int a, int b) {
        return b - a;
    }
}
