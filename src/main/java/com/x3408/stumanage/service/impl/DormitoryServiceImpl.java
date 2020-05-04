package com.x3408.stumanage.service.impl;

import com.github.pagehelper.PageHelper;
import com.x3408.stumanage.entity.Dormitory;
import com.x3408.stumanage.mapper.DormitoryMapper;
import com.x3408.stumanage.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {
    @Autowired
    private DormitoryMapper dormitoryMapper;


    @Override
    public List<Dormitory> getDormitory(Integer page, Dormitory dormitory) {
        PageHelper.startPage(page, 10);
        return  dormitoryMapper.getDormitory(dormitory);
    }

    @Override
    public Integer editDormitory(Dormitory dormitory) {
        return dormitoryMapper.editDormitory(dormitory);
    }

    @Override
    public Integer delDormitory(Integer id) {
        return dormitoryMapper.delDormitory(id);
    }

    @Override
    public Integer addDormitory(Integer id) {
        return dormitoryMapper.addDormitory(id);
    }
}
