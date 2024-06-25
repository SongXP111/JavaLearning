package com.xipeng.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {
    public static void main(String[] args) {
        // for each
        Collection<String> collection = new ArrayList<>();
        collection.add("zhangsan");
        collection.add("lisi");
        collection.add("wangwu");

        for (String s : collection) {
            System.out.println(s);
        }
    }
}
