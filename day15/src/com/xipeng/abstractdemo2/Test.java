package com.xipeng.abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog();
        f.drink();
        f.eat();

        Dog d = new Dog();
        d.drink();
        d.eat();

        Sheep s = new Sheep();
        s.drink();
        s.eat();
    }
}
