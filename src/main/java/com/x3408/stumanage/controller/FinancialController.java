package com.x3408.stumanage.controller;

import com.github.pagehelper.PageInfo;
import com.x3408.stumanage.commons.ResultUtil;
import com.x3408.stumanage.entity.Dept;
import com.x3408.stumanage.entity.Financial;
import com.x3408.stumanage.service.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FinancialController {
    @Autowired
    private FinancialService financialService;

    @GetMapping("/getFinancial")
    public ResultUtil getFinancial(@RequestParam("currentPage") Integer page,
                                   @RequestParam("college") String college, Financial financial) {
        List<Financial> financials = financialService.getFinancial(page, college, financial);
        PageInfo<Financial> pageInfo = new PageInfo<>(financials);
        return ResultUtil.success(financials, pageInfo.getTotal());
    }

    @PutMapping("/editFinancial")
    public ResultUtil editFinancial(Financial financial) {
        Integer count = financialService.editFinancial(financial);
        if (count == 1)
            return ResultUtil.success();
        else
            return ResultUtil.failLogin();
    }

    @DeleteMapping("/delFinancial")
    public ResultUtil delFinancial(Integer id) {
        Integer count = financialService.delFinancial(id);
        if (count == 1)
            return ResultUtil.success();
        else
            return ResultUtil.failLogin();
    }
}
