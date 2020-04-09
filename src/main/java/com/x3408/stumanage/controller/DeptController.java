package com.x3408.stumanage.controller;

import com.github.pagehelper.PageInfo;
import com.x3408.stumanage.commons.ResultUtil;
import com.x3408.stumanage.entity.Dept;
import com.x3408.stumanage.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/getDept")
    public ResultUtil getDept(@RequestParam(value = "currentPage") Integer page,
                              @RequestParam(value = "college") String college,
                              @RequestParam(value = "offer", required = false) String offer,
                              @RequestParam(value = "identity", required = false) String identity,
                              @RequestParam(value = "ticket", required = false) String ticket) {
        List<Dept> depts = deptService.getDept(page, college, identity, ticket, offer);
        PageInfo<Dept> pageInfo = new PageInfo<>(depts);
        return ResultUtil.success(depts, pageInfo.getTotal());
    }

    @PutMapping("/editDept")
    public ResultUtil editDept(Dept dept) {
        Integer count = deptService.editDept(dept);
        if (count == 1)
            return ResultUtil.success();
        else
            return ResultUtil.failLogin();
    }

    @DeleteMapping("/delDept")
    public ResultUtil delDept(@RequestParam("id") Integer id) {
        Integer count = deptService.delDept(id);
        if (count == 1)
            return ResultUtil.success();
        else
            return ResultUtil.failLogin();
    }
}
