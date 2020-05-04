package com.x3408.stumanage.service;

import com.x3408.stumanage.entity.Dormitory;

import java.util.List;

public interface DormitoryService {
    List<Dormitory> getDormitory(Integer page, Dormitory dormitory);

    Integer editDormitory(Dormitory dormitory);

    Integer delDormitory(Integer id);

    Integer addDormitory(Integer id);
}
