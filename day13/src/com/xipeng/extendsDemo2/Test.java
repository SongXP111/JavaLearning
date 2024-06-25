package com.xipeng.extendsDemo2;

public class Test {
    public static void main(String[] args) {
        // 利用空参构造创建子类对象
        Zi z1 = new Zi();

        Zi z2 = new Zi("zhangsan", 23);
    }
}

class Fu {
    String name;
    int age;

    public Fu() {}
    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu {
    // 子类不能继承父类的构造方法
    public Zi(String zhangsan, int i) {
        super(zhangsan, i);
    }

    public Zi() {

    }
}