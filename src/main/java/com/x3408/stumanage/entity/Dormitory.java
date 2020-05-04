package com.x3408.stumanage.entity;

public class Dormitory {
    private Integer id;
    private String dormitoryNo;
    private String dormitoryType;
    private Financial financial;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDormitoryNo() {
        return dormitoryNo;
    }

    public void setDormitoryNo(String dormitoryNo) {
        this.dormitoryNo = dormitoryNo;
    }

    public String getDormitoryType() {
        return dormitoryType;
    }

    public void setDormitoryType(String dormitoryType) {
        this.dormitoryType = dormitoryType;
    }

    public Financial getFinancial() {
        return financial;
    }

    public void setFinancial(Financial financial) {
        this.financial = financial;
    }
}
