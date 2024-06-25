package com.xipeng.extendsDemo8;

public class Manager extends Employee {
    private double bonus;

    public Manager() {}

    public Manager(String ID, String name, double salary, double bonus) {
        super(ID, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
