package com.xipeng.extendsDemo4;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();

        OverseasStudent o = new OverseasStudent();
        o.lunch();
    }
}

// 重写：父类的方法不能满足子类现在的需求时，需要进行方法重写
// 格式：子类和父类一模一样的声明方法，就是重写
// 注解：@Override
// 如果发生了重写，会覆盖虚方法表的方法
// 注意事项：
//  1. 重写方法名称，形参要与父类一直
//  2. 访问权限子类大于等于父类（空着 < protected < public）
//  3，返回值子类必须小于等于父类
//  4. 建议：重写方法与父类保持一致
//  5. 只有添加到虚方法表中的方法才能被重写
//  6. private，final不能被重写

class Person {
    public void eat() {
        System.out.println("吃米饭，吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class OverseasStudent extends Person {
    public void lunch() {
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    @Override
    public void eat() {
        System.out.println("吃意大利面");
    }

    @Override
    public void drink() {
        System.out.println("喝凉水");
    }
}

class Student extends Person {
    public void lunch() {
        // 实际上是this.eat()
        // 先在本类中查找eat和drink方法，如果没有，就去父类中查找
        eat();
        drink();

        // super可以直接调用父类中的方法
        super.eat();
        super.drink();
    }
}