package com.example.luban.demo.base.function;

/**
 * 函数编程Predicate-谓词
 *
 * @Author: dxq
 * @Date: 2021/4/13 10:03
 * @Version 1.0
 */
public class PredicateFunction {

    interface Predicate<T> {
        Boolean compare(T t);
    }

    /**
     * 接受两个参数，返回true or false
     *
     * @param <T>
     * @param <U>
     */
    public interface BiPredicate<T, U> {
        boolean test(T t, U u);
    }

    /**
     * 接受一个double，返回true or false
     */
    public interface DoublePredicate {
        boolean test(double value);
    }

    /**
     * 接受一个int，返回true or false
     */
    public interface IntPredicate {
        boolean test(int value);
    }

    /**
     * 接受一个Long，返回true or false
     */
    public interface LongPredicate {
        boolean test(long value);
    }

    public static void main(String[] args) {
        //表示定义了一个Predicate实现，入参为Integer，返回传入参数与5的比较。
        Predicate<Integer> boolValue = x -> x > 5;

        System.out.println(boolValue.compare(5));
        System.out.println(boolValue.compare(1));
        System.out.println(boolValue.compare(8));

    }
}
