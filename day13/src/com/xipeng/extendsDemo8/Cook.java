package com.xipeng.extendsDemo8;

public class Cook extends Employee {
    public Cook() {
    }

    public Cook(String ID, String name, double salary) {
        super(ID, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }
}
