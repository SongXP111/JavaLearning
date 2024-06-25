package com.xipeng.MethodDemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        // 目标：带返回值方法定义和调用

        // 直接调用
        getSum(10, 20, 30);

        // 赋值调用
        int res = getSum(10, 20, 30);
        System.out.println(res);

        // 输出调用
        System.out.println(getSum(10, 20, 30));
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }
}
