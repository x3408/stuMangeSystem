package com.x3408.stumanage.service;

import com.x3408.stumanage.entity.Freshman;
import com.x3408.stumanage.entity.FreshmanData;

import java.util.List;

public interface FreshmanService {

    List<Freshman> getFreshman(Freshman freshman, Integer currentPage);

    Integer delFreshman(Integer id);

    Integer editFreshman(Freshman freshman);

    Integer addFreshman(Freshman freshman);

    List<FreshmanData> getFreshmanData();
}
