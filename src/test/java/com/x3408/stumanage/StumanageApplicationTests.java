package com.x3408.stumanage;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.x3408.stumanage.entity.Admin;
import com.x3408.stumanage.entity.Dept;
import com.x3408.stumanage.entity.Financial;
import com.x3408.stumanage.mapper.AdminMapper;
import com.x3408.stumanage.mapper.DeptMapper;
import com.x3408.stumanage.service.AdminService;
import com.x3408.stumanage.service.DeptService;
import com.x3408.stumanage.service.FinancialService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StumanageApplicationTests {
    @Autowired
    private FinancialService financialService;
    @Test
    void contextLoads() {
        List<Financial> dept = financialService.getFinancial(1,"体育学院", new Financial());
        System.out.println(dept.get(0).getDept().getFreshman().getName());
    }
}
