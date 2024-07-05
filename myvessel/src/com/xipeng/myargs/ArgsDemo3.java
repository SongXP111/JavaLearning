package com.xipeng.myargs;

public class ArgsDemo3 {
    public static void main(String[] args) {
        // 可变参数
        // 方法形参的个数可以发生变化
        // 格式：属性类型... 名字
        System.out.println(getSum(1, 2, 3, 4));
    }

    // 底层：
    // 数组
    public static int getSum(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}
