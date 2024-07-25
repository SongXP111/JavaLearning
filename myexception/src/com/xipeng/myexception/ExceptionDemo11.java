package com.xipeng.myexception;

public class ExceptionDemo11 {
    public static void main(String[] args) {
        // throwable 方法
        // 1. getMessage
        // 2. toString
        // 3. printStackTrace:
        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("看看我执行了吗");
    }
}
