package com.example.luban.demo.base.T;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dxq
 * @Date: 2021/4/12 14:20
 * @Version 1.0
 */
@Data
public class Banana extends Fruits implements Serializable {

    private String place;

    private Integer size;


}
