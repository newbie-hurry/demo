package com.example.luban.demo;

import com.example.luban.demo.base.T.Banana;

/**
 * 水果颜色枚举
 *
 * @Author: dxq
 * @Date: 2021/4/12 14:44
 * @Version 1.0
 */
public enum FruitEnum {

    APPLE("apple", "苹果", "红色"),
    BANANA("banana", "香蕉", "黄色"),
    ORANGE("orange", "橘子", "青色");

    /**
     * 英文名称
     */
    private String name;
    /**
     * 名称
     */
    private String description;
    /**
     * 颜色
     */
    private String color;

    FruitEnum(String name, String description, String color) {
        this.name = name;
        this.description = description;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 普通方法
    public static String getColor(String name) {
        for (FruitEnum fruit : FruitEnum.values()) {
            switch (fruit.getName()) {
                case "苹果":
                    return fruit.getColor();
                case "香蕉":
                    return fruit.getColor();
                case "橘子":
                    return fruit.getColor();
                default:
                    break;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Banana banana = new Banana();
        banana.setName("香蕉");
        String color = FruitEnum.getColor(banana.getName());
        System.out.println(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
