package com.xipeng.myargs;

public class ArgsDemo1 {
    public static void main(String[] args) {
        // 重载
        // 如果需要n个数怎么办
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
