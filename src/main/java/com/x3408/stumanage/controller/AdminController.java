package com.x3408.stumanage.controller;

import com.github.pagehelper.PageInfo;
import com.x3408.stumanage.commons.ResultUtil;
import com.x3408.stumanage.entity.Admin;
import com.x3408.stumanage.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
    public ResultUtil login(@RequestParam("username") String username,
                            @RequestParam("password") String password) {
        Admin admin = adminService.login(username, password);
        if (admin != null) {
            return ResultUtil.success(admin);
        } else {
            return ResultUtil.failLogin();
        }
    }

    @PostMapping("/addAdmin")
    public ResultUtil addAdmin(Admin admin) {
        Integer count = adminService.addAdmin(admin);
        if (count != 1)
            return ResultUtil.failLogin();
        return ResultUtil.success();
    }

    @PutMapping("/editAdmin")
    public ResultUtil editAdmin(Admin admin) {
        Integer count = adminService.editAdmin(admin);
        if (count != 1)
            return ResultUtil.failLogin();
        return ResultUtil.success();
    }

    @DeleteMapping("/delAdmin")
    public ResultUtil delAdmin(Integer id) {
        Integer count = adminService.delAdmin(id);
        if (count != 1)
            return ResultUtil.failLogin();
        return ResultUtil.success();
    }

    @GetMapping("/getAdmin")
    public ResultUtil getAdmin(Admin admin,Integer currentPage) {
        List<Admin> admins = adminService.getAdmin(admin,currentPage);
        PageInfo<Admin> pageInfo = new PageInfo<>(admins);
        long total = pageInfo.getTotal();
        return ResultUtil.success(admins,total);
    }
}
