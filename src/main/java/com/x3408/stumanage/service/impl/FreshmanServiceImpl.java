package com.x3408.stumanage.service.impl;

import com.github.pagehelper.PageHelper;
import com.x3408.stumanage.entity.Admin;
import com.x3408.stumanage.entity.Dept;
import com.x3408.stumanage.entity.Freshman;
import com.x3408.stumanage.entity.FreshmanData;
import com.x3408.stumanage.mapper.FreshmanMapper;
import com.x3408.stumanage.service.DeptService;
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
        freshmanMapper.addFreshman(freshman);
        Dept dept = new Dept();
        dept.setFreshman(freshman);
        deptService.addDept(dept);
        financialService.addFinancial(dept.getId());
        return 1;
    }

    @Override
    public List<FreshmanData> getFreshmanData() {
        return freshmanMapper.getFreshmanData();
    }
}
