package com.xipeng.StringBuilderDemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        // 创建
        StringBuilder sb = new StringBuilder("abc");

        // 添加
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        // 反转
        sb.reverse();

        // 长度
        int len = sb.length();
        System.out.println(len);

        // 打印
        // 因为StringBuilder是Java写好的，Java做了特殊处理
        // 打印的对象是属性值而不是地址值
        System.out.println(sb);
    }
}
