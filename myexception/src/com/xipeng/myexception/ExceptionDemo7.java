package com.xipeng.myexception;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        // try catch 四个问题：
        // 1. 如果try中没有遇到问题，怎么执行？
        //    会把try里面所有的代码执行完毕，不会执行catch里面的代码

        // 2. 如果try中可能遇到多个问题，怎么执行？
        // 3. 如果try中遇到的问题没有被捕获，怎么执行？
        // 4. 如果try中遇到了问题，那么try下面的代码还会执行吗？

        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗");
    }
}
