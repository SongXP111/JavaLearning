package com.xipeng.extendsDemo8;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001", "zhangsan", 15000, 8000);
        System.out.println(m.getID() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setID("002");
        c.setName("lisi");
        c.setSalary(8000);
        System.out.println(c.getID() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}
