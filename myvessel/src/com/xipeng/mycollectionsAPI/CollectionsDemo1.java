package com.xipeng.mycollectionsAPI;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        // addAll
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list);

        // shuffle
        Collections.shuffle(list);
        System.out.println(list);
    }
}
