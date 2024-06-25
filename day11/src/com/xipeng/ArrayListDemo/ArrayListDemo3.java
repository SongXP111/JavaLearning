package com.xipeng.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        // 包装类
        // char -> Character
        // int -> Integer

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('b');
        list1.add('c');

        for (Character character : list1) {
            System.out.println(character);
        }
    }
}
