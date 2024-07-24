package com.xipeng.myexception;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        // try catch
        // try可能出现异常的代码
        // catch异常处理的代码
        // 异常后继续执行

        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(arr[10]);
//        System.out.println("看看我执行了吗");

        try {
            System.out.println(arr[10]);
            System.out.println(arr[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗");
    }
}
