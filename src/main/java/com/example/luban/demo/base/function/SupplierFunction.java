package com.example.luban.demo.base.function;

import java.util.function.Supplier;

/**
 * Supplier无需参数，返回一个结果。
 *
 * @Author: dxq
 * @Date: 2021/4/13 10:58
 * @Version 1.0
 */
public class SupplierFunction {

    /**
     * 返回boolean值
     */
    public interface BooleanSupplier {
        boolean getAsBoolean();
    }

    /**
     * 返回double
     */
    public interface DoubleSupplier {
        double getAsDouble();
    }

    /**
     * 返回int
     */
    public interface IntSupplier {
        int getAsInt();
    }

    /**
     * 返回long
     */
    @FunctionalInterface
    public interface LongSupplier {
        long getAsLong();
    }

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello world!";

        com.google.common.base.Supplier<String> stringCopier = () -> {
            return "hello world!";
        };
        String s = supplier.get();
        System.out.println(s);
        String s1 = stringCopier.get();
        System.out.println(s1);

        com.google.common.base.Supplier<Long> longCopier = () -> {
            //此时接受参数只能为基本类型
            Long number = Long.getLong("1");
            long num = 1000;
            return num;
        };
        Long value = longCopier.get();
        System.out.println(value);
    }


}
