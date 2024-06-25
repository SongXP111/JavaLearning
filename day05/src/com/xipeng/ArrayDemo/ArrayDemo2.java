package com.xipeng.ArrayDemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 索引
        // 获取
        int[] arr = {1, 2, 3, 4, 5};
        int number = arr[0];
        System.out.println(number);
        System.out.println(arr[1]);

        // 储存
        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
