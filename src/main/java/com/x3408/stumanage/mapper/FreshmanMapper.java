package com.x3408.stumanage.mapper;

import com.x3408.stumanage.entity.Freshman;
import com.x3408.stumanage.entity.FreshmanData;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface FreshmanMapper {
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into freshman_info(name,college,country,identity,gender,phone,emergencyContact,emergencyPhone) " +
            "values(#{name},#{college},#{country},#{identity},#{gender},#{phone},#{emergencyContact},#{emergencyPhone})")
    Integer addFreshman(Freshman freshman);

    @Update("update freshman_info set " +
            "name=#{name},college=#{college},country=#{country}," +
            "identity=#{identity},gender=#{gender},phone=#{phone},emergencyContact=#{emergencyContact},emergencyPhone=#{emergencyPhone} " +
            "where id=#{id}")
    Integer editFreshman(Freshman freshman);

    @Delete("delete from freshman_info where id=#{id}")
    Integer delFreshman(Integer id);

    List<Freshman> getFreshman(Freshman freshman);

    @Select("SELECT COUNT(`country` = '信息工程' OR NULL) AS itCollege," +
            "COUNT(`country` = '体育学院' OR NULL) AS peCollege," +
            "COUNT(`country` = '文学传媒与教育' OR NULL) AS chCollege," +
            "COUNT(`country` = '经济与法学院' OR NULL) AS ecCollege  " +
            "FROM freshman_info")
    List<FreshmanData> getFreshmanData();
}
