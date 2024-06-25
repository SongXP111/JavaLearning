package com.xipeng.codeBlockDemo2;

public class Test {
    public static void main(String[] args) {
        // 静态代码块
        // static{}
        // 随着类的加载而加载，并且自动触发，只执行一次
        // 可以用来初始化一些数据
        Student s1 = new Student();
        Student s2 = new Student("zhangsan", 23);
    }
}
