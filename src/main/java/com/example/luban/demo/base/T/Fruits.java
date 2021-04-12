package com.example.luban.demo.base.T;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dxq
 * @Date: 2021/4/12 14:18
 * @Version 1.0
 */
@Data
public class Fruits implements Serializable {

    private String name;

    private String color;

    public <T extends Fruits> void printColor(T type) {
    }
}
