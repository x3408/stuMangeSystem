package com.x3408.stumanage.service.impl;

import com.github.pagehelper.PageHelper;
import com.x3408.stumanage.controller.DormitoryController;
import com.x3408.stumanage.entity.*;
import com.x3408.stumanage.mapper.FreshmanMapper;
import com.x3408.stumanage.service.DeptService;
import com.x3408.stumanage.service.DormitoryService;
import com.x3408.stumanage.service.FinancialService;
import com.x3408.stumanage.service.FreshmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreshmanServiceImpl implements FreshmanService {
    @Autowired
    FreshmanMapper freshmanMapper;
    @Autowired
    DeptService deptService;
    @Autowired
    FinancialService financialService;
    @Autowired
    DormitoryService dormitoryService;

    @Override
    public List<Freshman> getFreshman(Freshman freshman, Integer currentPage) {
        PageHelper.startPage(currentPage,10);
        return freshmanMapper.getFreshman(freshman);
    }

    @Override
    public Integer delFreshman(Integer id) {
        return freshmanMapper.delFreshman(id);
    }

    @Override
    public Integer editFreshman(Freshman freshman) {
        return freshmanMapper.editFreshman(freshman);
    }

    @Override
    public Integer addFreshman(Freshman freshman) {
        Dept dept = new Dept();
        Financial financial = new Financial();
        freshmanMapper.addFreshman(freshman);
        dept.setFreshman(freshman);
        deptService.addDept(dept);
        financial.setDept(dept);
        financialService.addFinancial(financial);
        dormitoryService.addDormitory(financial.getId());
        return 1;
    }

    @Override
    public List<FreshmanData> getFreshmanData() {
        return freshmanMapper.getFreshmanData();
    }
}
