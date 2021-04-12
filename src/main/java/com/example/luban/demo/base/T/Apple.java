package com.example.luban.demo.base.T;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dxq
 * @Date: 2021/4/12 14:19
 * @Version 1.0
 */
@Data
public class Apple extends  Fruits implements Serializable {

    private Integer size;

    private String place;

}
