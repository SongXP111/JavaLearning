package com.xipeng.staticDemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxAgeStudent(ArrayList<Student> students) {
        int res = 0;
        for (Student student : students) {
            int age = student.getAge();
            if (age > res) {
                res = age;
            }
        }
        return res;
    }
}
