package com.x3408.stumanage.mapper;

import com.x3408.stumanage.entity.Dormitory;
import com.x3408.stumanage.entity.Financial;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DormitoryMapper {
    List<Dormitory> getDormitory(@Param("dormitory") Dormitory dormitory);

    @Update("update dormitory_info set dormitoryNo=#{dormitoryNo},dormitoryType=#{dormitoryType} " +
            "where id=#{id}")
    Integer editDormitory(Dormitory dormitory);

    @Delete("delete from dormitory_info where id=#{id}")
    Integer delDormitory(Integer id);

    @Insert("insert into dormitory_info(financialId) value(#{financialId})")
    Integer addDormitory(Integer financialId);
}
