package com.x3408.stumanage.service;

import com.x3408.stumanage.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> getDept(Integer page, String college, String identity, String ticket, String offer);

    Integer editDept(Dept dept);

    Integer delDept(Integer id);

    Integer addDept(Dept dept);
}
