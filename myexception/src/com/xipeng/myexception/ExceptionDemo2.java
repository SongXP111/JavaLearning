package com.xipeng.myexception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        // 异常的作用：
        // 1. 查询bug的关键参考信息
        // 2. 作为方法内部的特殊返回值，以便通知调用者底层的执行情况
        Student[] arr = new Student[3];
        String name = arr[0].getName();
        System.out.println(name);


    }
}
