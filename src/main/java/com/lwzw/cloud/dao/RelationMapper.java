package com.lwzw.cloud.dao;

import com.lwzw.cloud.bean.Relation;

public interface RelationMapper {
    int deleteByPrimaryKey(Integer relaid);

    int insert(Relation record);

    int insertSelective(Relation record);

    Relation selectByPrimaryKey(Integer relaid);

    int updateByPrimaryKeySelective(Relation record);

    int updateByPrimaryKey(Relation record);
}