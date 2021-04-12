package com.example.luban.demo.test;

/**
 * @Author: dxq
 * @Date: 2021/4/9 9:51
 * @Version 1.0
 */
public class Java8Tester {

    private Integer operate(Integer a, Integer b, MathOperation mathOperation) {

        return mathOperation.operation(a, b);
    }

    MathOperation addition = (a, b) -> a + b;

    MathOperation subtraction = (Integer a, Integer b) -> a - b;

    MathOperation multiplication = (a, b) -> {
        return a * b;
    };

    MathOperation division = (Integer a, Integer b) -> a / b;


    public static void main(String[] args) {

        Java8Tester java8Tester = new Java8Tester();
        System.out.println("10+5=" + java8Tester.operate(10, 5, java8Tester.addition));
        System.out.println("10-5=" + java8Tester.operate(10, 5, java8Tester.subtraction));
        System.out.println("10*5=" + java8Tester.operate(10, 5, java8Tester.multiplication));
        System.out.println("10/5=" + java8Tester.operate(10, 5, java8Tester.division));

        GreetingService sayHello = (message -> System.out.println("Hello," + message));
        GreetingService sayGoodbye = message -> System.out.println("goodBye!" + message);

        sayHello.sayMessage("java!");
        sayGoodbye.sayMessage("shenzhen!");


    }

}
