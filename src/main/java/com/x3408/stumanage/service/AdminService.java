package com.x3408.stumanage.service;

import com.x3408.stumanage.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin login(String username, String password);

    Integer addAdmin(Admin admin);

    Integer editAdmin(Admin admin);

    Integer delAdmin(Integer id);

    List<Admin> getAdmin(Admin admin, Integer currentPage);
}
