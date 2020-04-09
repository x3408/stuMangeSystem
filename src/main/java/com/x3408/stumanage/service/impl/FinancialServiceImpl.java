package com.x3408.stumanage.service.impl;

import com.github.pagehelper.PageHelper;
import com.x3408.stumanage.entity.Financial;
import com.x3408.stumanage.mapper.FinancialMapper;
import com.x3408.stumanage.service.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialServiceImpl implements FinancialService {
    @Autowired
    FinancialMapper financialMapper;
    @Override
    public List<Financial> getFinancial(Integer page, String college, Financial financial) {
        PageHelper.startPage(page, 10);
        return  financialMapper.getFinancial(college, financial);
    }

    @Override
    public Integer editFinancial(Financial financial) {
        return financialMapper.editFinancial(financial);
    }

    @Override
    public Integer delFinancial(Integer id) {
        return financialMapper.delFinancial(id);
    }

    @Override
    public Integer addFinancial(Integer id) {
        return financialMapper.addFinancial(id);
    }
}
