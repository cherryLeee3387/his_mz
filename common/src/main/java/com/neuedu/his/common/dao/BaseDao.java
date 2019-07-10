package com.neuedu.his.common.dao;


import com.neuedu.his.common.bean.BaseBean;

import java.util.List;

//
public interface BaseDao<T extends BaseBean> {

    void insert(T t);

    //批量插入数据
    void insertBatch(List<T> list);

    void update(T t);

    void delete(T condition);  //condition作为删除的条件对象

    //根据id删除数据
    void deleteById(String id);

    //根据id查询
    T findById(String id);

    //根据传入的condition对象查询
    T find(T condition);

    //根据条件查询对象集合
    List<T> findList(T condition);

    //查询所有
    List<T> findAll();

}
