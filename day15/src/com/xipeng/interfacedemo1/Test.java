package com.xipeng.interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Rabbit r =  new Rabbit();
        r.eat();

        Frog f = new Frog();
        f.eat();
        f.swim();

        Dog d = new Dog();
        d.eat();
        d.swim();
    }
}
