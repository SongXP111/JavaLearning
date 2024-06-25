package com.xipeng.myset;

public class HashSetDemo1 {
    public static void main(String[] args) {
        // 哈希值：
        // 1. 如果没有重写hashCode方法，计算出的哈希值是不同的
        // 2. 如果已经重写hashCode方法，不同的对象只要属性值相同，计算出的哈希值是一样的
        // 3. 小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也是一样的（哈希冲突/哈希碰撞）

        // 1. 创建对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);

        // 2. 没有重写hashCode(不一样)
        // 重写了就一样
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // 哈希碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
