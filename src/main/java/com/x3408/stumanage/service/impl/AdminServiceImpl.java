package com.x3408.stumanage.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.x3408.stumanage.entity.Admin;
import com.x3408.stumanage.entity.Freshman;
import com.x3408.stumanage.mapper.AdminMapper;
import com.x3408.stumanage.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public Admin login(String username, String password) {
        return adminMapper.login(username, password);
    }

    @Override
    public Integer addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    @Override
    public Integer editAdmin(Admin admin) {
        return adminMapper.editAdmin(admin);
    }

    @Override
    public Integer delAdmin(Integer id) {
        return adminMapper.delAdmin(id);
    }

    @Override
    public List<Admin> getAdmin(Admin admin, Integer currentPage) {
        PageHelper.startPage(currentPage, 10);
        return adminMapper.getAdmin(admin);
    }
}
