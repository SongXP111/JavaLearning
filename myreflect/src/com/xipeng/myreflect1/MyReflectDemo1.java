package com.xipeng.myreflect1;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        * 获取class对象的三种方式
        * 1. Class.forName()
        * 2. 类名.class
        * 3. 对象.getClass()
        * */

        // 1.
        // 包名 + 类名
        // 最常用
        Class clazz1 = Class.forName("com.xipeng.myreflect1.Student");

        // 2.
        // 更多的时候当作参数传递
        Class clazz2 = Student.class;

        // 3.
        // 当我们有这个类的对象才可以使用
        Student s = new Student();
        Class clazz3 = s.getClass();

        // 一样
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
    }
}
