package com.xipeng.mygenerics;

import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {
        // 泛型不具备继承性，但数据具备
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        method(list1);
//        method(list2); // 泛型里面写的什么类型，那么只能传递什么类型的数据

        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());
    }

    public static void method(ArrayList<Ye> list) {

    }
}

//class Ye {}
//
//class Fu extends Ye {}
//
//class Zi extends Fu {}