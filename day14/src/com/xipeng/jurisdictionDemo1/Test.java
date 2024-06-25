package com.xipeng.jurisdictionDemo1;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        // 报错：private只能在本类中使用
        // System.out.println(a.name);

        System.out.println(a.name);

        // 一般只用private和public
        // 成员变量私有
        // 方法公开
        // 特例：共性代码，一般用private
    }
}
