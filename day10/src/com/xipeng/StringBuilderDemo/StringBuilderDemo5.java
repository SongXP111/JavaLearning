package com.xipeng.StringBuilderDemo;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();


        // StringBuilder底层原理：
        // 开始是16的容量的数组
        // 扩容是老容量 * 2 + 2 = 34
        // 如果超出了默认的扩容机制，直接创造新长度的数组
    }
}
