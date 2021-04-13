package com.example.luban.demo.base.function;

import java.util.Arrays;
import java.util.List;

/**
 * Function 转换器
 * Function接受一个数据，返回一个数据。
 *
 * @Author: dxq
 * @Date: 2021/4/13 10:50
 * @Version 1.0
 */
public class FunctionTest {

    public interface Function<T, R> {
        R apply(T t);
    }

    /**
     * 接受两个数据，返回一个结果
     * @param <T>
     * @param <U>
     * @param <R>
     */
    public interface BiFunction<T, U, R> {
        R apply(T t, U u);
    }

    /**
     * 接受一个double类型数据，返回一个结果
     * @param <R>
     */
    public interface DoubleFunction<R> {
        R apply(double value);
    }

    /**
     * 接受一个double类型，返回一个int类型数据
     */
    public interface DoubleToIntFunction {
        int applyAsInt(double value);
    }

    /**
     * 接受一个double，返回一个long类型
     */
    public interface DoubleToLongFunction {
        long applyAsLong(double value);
    }

    /**
     * 接受一个int，返回一个结果
     * @param <R>
     */
    public interface IntFunction<R> {
        R apply(int value);
    }


    /**
     * 简单案例：Steam的map函数接受一个Function，接受一个数据，进行一定的处理后返回另一个数据，当然也可以不处理直接返回。
     * @param args
     */
    public static void main(String[] args) {
        List<Object> objects = Arrays.asList("a", "b", "c");
        objects.stream().map(t -> {
            return t + " hello";
        }).forEach(System.out::println);
    }


}
