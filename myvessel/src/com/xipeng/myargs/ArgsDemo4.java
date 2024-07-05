package com.xipeng.myargs;

public class ArgsDemo4 {
    public static void main(String[] args) {
        // 细节：
        // 1. 只可以写一个可变参数，类型不同也不行
        // 2. 如果有其他参数，可变参数要写在最后
    }

//    public static int getSum(int... args1, double... args2); 错

//    public static int getSum(int a, int... args); 对
//    public static int getSum(int... args, int a); 错
}
