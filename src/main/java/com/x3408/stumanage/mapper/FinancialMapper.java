package com.x3408.stumanage.mapper;

import com.x3408.stumanage.entity.Financial;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FinancialMapper {

    List<Financial> getFinancial(@Param("college") String college,@Param("financial") Financial financial);

    @Update("update financial_info set accommodation=#{accommodation},trainingPay=#{trainingPay},tuitionPayment=#{tuitionPayment} " +
            "where id=#{id}")
    Integer editFinancial(Financial financial);

    @Delete("delete from financial_info where id=#{id}")
    Integer delFinancial(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into financial_info(deptId) value(#{dept.id})")
    Integer addFinancial(Financial financial);
}
