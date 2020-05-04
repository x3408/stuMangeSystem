package com.x3408.stumanage.service;

import com.x3408.stumanage.entity.Financial;

import java.util.List;

public interface FinancialService {
    List<Financial> getFinancial(Integer page, String college, Financial financial);

    Integer editFinancial(Financial financial);

    Integer delFinancial(Integer id);

    Integer addFinancial(Financial financial);
}
