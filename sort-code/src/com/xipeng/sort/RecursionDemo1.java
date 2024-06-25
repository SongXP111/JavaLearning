package com.xipeng.sort;

public class RecursionDemo1 {
    public static void main(String[] args) {
        // 递归算法
        // 求1-100的和
        System.out.println(sum(100));
        System.out.println(factorial(5));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
