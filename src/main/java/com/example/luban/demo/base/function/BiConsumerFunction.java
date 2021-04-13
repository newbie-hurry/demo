package com.example.luban.demo.base.function;

/**
 * Consumer 消费者
 * 消费者是来消费的，它接受一个数据，没有任何返回值。
 *
 * @Author: dxq
 * @Date: 2021/4/13 10:44
 * @Version 1.0
 */
public class BiConsumerFunction {

    /**
     * 接受一个T的参数
     * @param <T>
     */
    public interface Consumer<T> {

        void accept(T t);
    }

    /**
     * 一次消费两个数据
     * @param <T>
     * @param <U>
     */
    public interface BiConsumer<T, U> {
        void accept(T t, U u);
    }

    /**
     * 消费一个Double类型的数据
     */
    public interface DoubleConsumer {
        void accept(double value);
    }

    /**
     * 消费一个int数据
     */
    public interface IntConsumer {
        void accept(int value);
    }

    /**
     * 消费一个Long数据
     */
    public interface LongConsumer {
        void accept(long value);
    }

    /**
     * 消费两个数据，其中一个为Double类型
     * @param <T>
     */
    public interface ObjDoubleConsumer<T> {
        void accept(T t, double value);
    }

    /**
     * 消费两个数据，其中一个为Int类型
     * @param <T>
     */
    public interface ObjIntConsumer<T> {
        void accept(T t, int value);
    }

    /**
     * 消费两个数据，其中一个为Long类型
     * @param <T>
     */
    public interface ObjLongConsumer<T> {
        void accept(T t, long value);
    }




}
