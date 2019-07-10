package com.neuedu.his.common.bean;

import lombok.Data;

import java.util.List;

@Data
public class Department extends BaseBean{

    private String departName;
    private String departType;
    private String departLevel;
    private String pid;
    private List<Department> children;     //子部门集合
}
