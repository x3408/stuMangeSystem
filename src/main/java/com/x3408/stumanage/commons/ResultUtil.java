package com.x3408.stumanage.commons;

import com.x3408.stumanage.entity.Admin;

import java.util.List;

public class ResultUtil {
    private String code;
    private String msg;
    private Integer isAdmin;
    private long total;
    //承载实体对象
    private Object data;

    public static ResultUtil failLogin() {
        return new ResultUtil("401", "用户名或密码错误");
    }
    public static ResultUtil successLogin(Integer isAdmin) {
        return new ResultUtil("200", "success", isAdmin);
    }
    public static ResultUtil noAuthorization() {
        return new ResultUtil("401", "请登陆后在尝试该操作");
    }
    public static ResultUtil success() {
        return new ResultUtil("200", "success");
    }
    public static ResultUtil success(Object data) {
        return new ResultUtil("200", "success", data);
    }
    public static ResultUtil success(Object data, long total) {
        return new ResultUtil("200", "success", total, data);
    }

    public ResultUtil(String code, String msg, long total, Object data) {
        this.code = code;
        this.msg = msg;
        this.total = total;
        this.data = data;
    }
    public ResultUtil(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ResultUtil(String code, String msg, Integer isAdmin) {
        this.code = code;
        this.msg = msg;
        this.isAdmin = isAdmin;
    }
    public ResultUtil(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
