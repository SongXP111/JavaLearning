package com.xipeng.myexception;

public class ExceptionDemo8 {
    public static void main(String[] args) {
        // 2. 如果try中可能遇到多个问题，怎么执行？
        //    写多个catch与之对应
        //    如果异常存在父子关系，父类要写在子类下面
        //    JDK7以后，可以用A ｜ B同时捕获多个异常

        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
            System.out.println(2/0); // 没有捕获
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }

        System.out.println("看看我执行了吗");
    }
}
