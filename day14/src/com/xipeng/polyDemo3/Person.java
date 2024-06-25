package com.xipeng.polyDemo3;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }

    public void keepPet(Animal a, String something) {
        System.out.print("年龄为" + getAge() + "的" + getName() + "养了一只");
        if (a instanceof Cat c) {
            System.out.println(c.getColor() + "的" + c.getAge() + "岁的猫");
            c.eat(something);
        } else if (a instanceof Dog d) {
            System.out.println(d.getColor() + "的" + d.getAge() + "岁的狗");
            d.eat(something);
        } else {
            System.out.println("不是猫也不是狗");
        }
    }
}
