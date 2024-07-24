package com.xipeng.myexception;

public class ExceptionDemo9 {
    public static void main(String[] args) {
        // 3. 如果try中遇到的问题没有被捕获，怎么执行？
        //    相当于try catch代码白写了，交给虚拟机进行处理
        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }

        System.out.println("看看我执行了吗");
    }
}
