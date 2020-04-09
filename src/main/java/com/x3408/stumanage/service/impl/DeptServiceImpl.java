package com.x3408.stumanage.service.impl;

import com.github.pagehelper.PageHelper;
import com.x3408.stumanage.entity.Dept;
import com.x3408.stumanage.mapper.DeptMapper;
import com.x3408.stumanage.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> getDept(Integer page, String college, String identity, String ticket, String offer) {
        PageHelper.startPage(page, 10);
        return deptMapper.getDept(college, identity, ticket, offer);
    }

    @Override
    public Integer editDept(Dept dept) {
        return deptMapper.editDept(dept);
    }

    @Override
    public Integer delDept(Integer id) {
        return deptMapper.delDept(id);
    }

    @Override
    public Integer addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }
}
