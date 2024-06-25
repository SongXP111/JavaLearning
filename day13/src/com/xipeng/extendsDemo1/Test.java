package com.xipeng.extendsDemo1;

public class Test {
    public static void main(String[] args) {
        // 布偶猫
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println("============");
        // 哈士奇
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
    }
}
