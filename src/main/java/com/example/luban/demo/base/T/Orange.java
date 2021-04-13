package com.example.luban.demo.base.T;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: dxq
 * @Date: 2021/4/12 14:22
 * @Version 1.0
 */
@Data
public class Orange extends Fruits implements Serializable {

    private String size;

    private BigDecimal price;

    private String season;
}
