package com.xipeng.myexception;

public class ExceptionDemo10 {
    public static void main(String[] args) {
        // 4. 如果try中遇到了问题，那么try下面的代码还会执行吗？
        //    下面代码不会执行，直接跳转到catch的语句体当中
        //    如果没有对应的catch，交给虚拟机处理

        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
            System.out.println("1234");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("空指针异常");
        }

        System.out.println("看看我执行了吗");
    }
}
