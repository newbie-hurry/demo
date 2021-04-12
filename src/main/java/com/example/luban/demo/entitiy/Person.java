package com.example.luban.demo.entitiy;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * person
 * @author 
 */
@ApiModel(value="com.example.luban.demo.entitiy.Person")
@Data
public class Person implements Serializable {
    private Long id;

    private String name;

    private Byte sex;

    private String job;

    private static final long serialVersionUID = 1L;
}