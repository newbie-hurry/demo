package com.example.luban.demo.dao;

import com.example.luban.demo.entitiy.Person;

public interface PersonDao {
    int deleteByPrimaryKey(Long id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}