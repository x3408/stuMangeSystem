package com.x3408.stumanage.mapper;

import com.x3408.stumanage.entity.Dept;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeptMapper {


    List<Dept> getDept(String college, String identity, String ticket, String offer);

    @Update("update dept_info set studentID=#{studentID},profession=#{profession},address=#{address}," +
            "offer=#{offer},ticket=#{ticket},identity=#{identity} where id=#{id}")
    Integer editDept(Dept dept);

    @Delete("delete from dept_info where id=#{id}")
    Integer delDept(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into dept_info(freshmanId) value(#{freshman.id})")
    Integer addDept(Dept dept);
}
