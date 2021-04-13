package com.example.luban.demo.base.function;

import java.util.function.BiFunction;

/**
 * 面向对象和面向函数编程比较
 *
 * @Author: dxq
 * @Date: 2021/4/13 9:42
 * @Version 1.0
 */
public class OOPCompareToFP {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    /**
     * 函数编程方法
     *
     * @param num1
     * @param num2
     * @param biFunction
     * @return
     */
    public int calculate(int num1, int num2, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(num1, num2);
    }

    /**
     * 普通方法
     *
     * @param num1
     * @param num2
     * @param operator
     * @return
     */
    public int calculate(int num1, int num2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("sorry,unknown operator!");
        }
        return result;
    }

    public static void main(String[] args) {
        OOPCompareToFP oopCompareToFP = new OOPCompareToFP();
        System.out.println("面向对象编程(针对数据)");
        System.out.println(oopCompareToFP.add(1, 1));
        System.out.println(oopCompareToFP.subtract(1, 1));
        System.out.println(oopCompareToFP.multiply(1, 1));
        System.out.println(oopCompareToFP.divide(1, 1));
        System.out.println("面向对象编程(针对数据)");


        System.out.println("函数式编程(针对行为)");
        System.out.println(oopCompareToFP.calculate(1, 1, (num1, num2) -> num1 + num2));
        System.out.println(oopCompareToFP.calculate(1, 1, (num1, num2) -> num1 - num2));
        System.out.println(oopCompareToFP.calculate(1, 1, (num1, num2) -> num1 * num2));
        System.out.println(oopCompareToFP.calculate(1, 1, (num1, num2) -> num1 / num2));
        System.out.println("函数式编程(针对行为)");

        System.out.println("其他方式");
        System.out.println(oopCompareToFP.calculate(1, 1, "+"));
        System.out.println(oopCompareToFP.calculate(1, 1, "-"));
        System.out.println(oopCompareToFP.calculate(1, 1, "*"));
        System.out.println(oopCompareToFP.calculate(1, 1, "/"));
        System.out.println("其他方式");
    }

}
