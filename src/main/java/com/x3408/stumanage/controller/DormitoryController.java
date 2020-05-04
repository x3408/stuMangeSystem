package com.x3408.stumanage.controller;

import com.github.pagehelper.PageInfo;
import com.x3408.stumanage.commons.ResultUtil;
import com.x3408.stumanage.entity.Dormitory;
import com.x3408.stumanage.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DormitoryController {
    @Autowired
    DormitoryService dormitoryService;
    @GetMapping("/getDormitory")
    public ResultUtil getDormitory(@RequestParam("currentPage") Integer page,
                                   Dormitory dormitory) {
        List<Dormitory> Dormitorys = dormitoryService.getDormitory(page, dormitory);
        PageInfo<Dormitory> pageInfo = new PageInfo<>(Dormitorys);
        return ResultUtil.success(Dormitorys, pageInfo.getTotal());
    }

    @PutMapping("/editDormitory")
    public ResultUtil editDormitory(Dormitory Dormitory) {
        Integer count = dormitoryService.editDormitory(Dormitory);
        if (count == 1)
            return ResultUtil.success();
        else
            return ResultUtil.failLogin();
    }

    @DeleteMapping("/delDormitory")
    public ResultUtil delDormitory(Integer id) {
        Integer count = dormitoryService.delDormitory(id);
        if (count == 1)
            return ResultUtil.success();
        else
            return ResultUtil.failLogin();
    }
}
