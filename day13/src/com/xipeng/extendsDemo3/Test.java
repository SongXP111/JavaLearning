package com.xipeng.extendsDemo3;

public class Test {
    public static void main(String[] args) {
        // 利用空参构造创建子类对象
        Zi z = new Zi();
        z.ziShow();
    }
}

class Ye {
    String name = "Ye";
}

class Fu extends Ye {
    String name = "Fu";
}

class Zi extends Fu {
    String name = "Zi";
    public void ziShow() {
        String name = "zishow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
//        System.out.println(super.super.name);
    }
}