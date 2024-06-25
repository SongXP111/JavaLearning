package com.xipeng.mygenerics;

import java.util.ArrayList;

public class GenericsDemo6 {
    public static void main(String[] args) {
        // 定义一个方法，形参是一个集合，类型不确定
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
    }


    // 弊端：此时可以接受任意类型的数据，比如除了爷父子之外的Student
    // 希望：只能传递爷父子
    // 泛型的通配符:表示不确定类型，但可以进行类型的限定
    // ? extends E：E和E所有子类类型
    // ? super E：E和E所有父类类型
    // 应用场景：
    // 1. 定义类，方法，接口的时候类型不确定
    // 2. 类型不确定，但知道继承体系
    public static<E> void method(ArrayList<? extends Ye> list) {

    }
}

class Ye {}
class Fu extends Ye {}
class Zi extends Fu {}
