package com.xipeng.test6;

import java.lang.reflect.Array;

public class ProductTest {
    public static void main(String[] args) {
        Product a = new Product(1, "A", 10, 3);
        Product b = new Product(1, "B", 10, 3);
        Product c = new Product(1, "C", 10, 3);

        Product[] arr = new Product[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
