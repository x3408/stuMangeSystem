package com.x3408.stumanage.mapper;

import com.x3408.stumanage.entity.Admin;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AdminMapper {

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Select("select * from admin where username=#{username} and password=#{password}")
    Admin login(String username, String password);


    @Insert("insert into admin(username,password,userno,college,isAdmin) " +
            "values(#{username},#{password},#{userno},#{college},#{isAdmin})")
    Integer addAdmin(Admin admin);

    @Update("update admin set " +
            "username=#{username},password=#{password},userno=#{userno},college=#{college},isAdmin=#{isAdmin} " +
            "where id=#{id}")
    Integer editAdmin(Admin admin);

    @Delete("delete from admin where id=#{id}")
    Integer delAdmin(Integer id);

    List<Admin> getAdmin(Admin admin);
}
