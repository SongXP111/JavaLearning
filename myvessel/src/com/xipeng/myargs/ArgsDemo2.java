package com.xipeng.myargs;

public class ArgsDemo2 {
    public static void main(String[] args) {
        // 计算n个数之后
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getSum(arr));


    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
