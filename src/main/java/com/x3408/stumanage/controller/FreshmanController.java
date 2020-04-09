package com.x3408.stumanage.controller;

import com.github.pagehelper.PageInfo;
import com.x3408.stumanage.commons.ResultUtil;
import com.x3408.stumanage.entity.Freshman;
import com.x3408.stumanage.entity.FreshmanData;
import com.x3408.stumanage.service.FreshmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FreshmanController {
    @Autowired
    private FreshmanService freshmanService;

    @PostMapping("/addFreshman")
    public ResultUtil addFreshman(Freshman freshman) {
        Integer count = freshmanService.addFreshman(freshman);
        if (count != 1)
            return ResultUtil.failLogin();
        return ResultUtil.success();
    }

    @PutMapping("/editFreshman")
    public ResultUtil editFreshman(Freshman freshman) {
        Integer count = freshmanService.editFreshman(freshman);
        if (count != 1)
            return ResultUtil.failLogin();
        return ResultUtil.success();
    }

    @DeleteMapping("/delFreshman")
    public ResultUtil delFreshman(Integer id) {
        Integer count = freshmanService.delFreshman(id);
        if (count != 1)
            return ResultUtil.failLogin();
        return ResultUtil.success();
    }

    @GetMapping("/getFreshman")
    public ResultUtil getFreshman(Freshman freshman, Integer currentPage) {
        List<Freshman> freshmans = freshmanService.getFreshman(freshman, currentPage);
        PageInfo<Freshman> info = new PageInfo<>(freshmans);
        long total = info.getTotal();
        return ResultUtil.success(freshmans,total);
    }

    @GetMapping("/getFreshmanData")
    public ResultUtil getFreshmanData() {
        List<FreshmanData> list = freshmanService.getFreshmanData();
        return ResultUtil.success(list);
    }
}
