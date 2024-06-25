package com.xipeng.extendsDemo8;

public class Employee {
    private String ID;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println("员工在工作");
    }

    public void eat() {
        System.out.println("吃米饭");
    }

    /**
     * 获取
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{ID = " + ID + ", name = " + name + ", salary = " + salary + "}";
    }
}
