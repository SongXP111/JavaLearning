package com.xipeng.myexception;

public class ExceptionDemo12 {
    public static void main(String[] args) {
        // throws：写在方法定义处，表示声明一个异常，告诉调用者，使用本方法可能会生成哪些异常
        // throw：写在方法内，结束方法，手动抛出异常对象，交给调用者，方法下面的代码不再执行
        // 需求：定义一个方法求数组的最大值

        int[] arr = {1, 2, 3, 4, 5};
//        arr = null; // NullPointerException
//        arr = new int[]{}; // OutOfBoundException
        try {
            System.out.println(getMax(arr));
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界异常");
        }
    }

    public static int getMax(int[] arr) /*throws NullPointerException, ArrayIndexOutOfBoundsException*/ {
        if (arr == null) {
            throw new NullPointerException();
        }
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
