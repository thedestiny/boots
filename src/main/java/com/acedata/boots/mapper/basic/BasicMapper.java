package com.acedata.boots.mapper.basic;


import java.io.Serializable;
import java.util.List;

public interface BasicMapper <T , PK extends Serializable> {


    Integer save(T t);

    Integer saveList(List<T> t);

    Integer updateByPrimaryKey(T t);

    T queryOneByPrimaryKey(PK pk);

    List<T> queryAll();





}
