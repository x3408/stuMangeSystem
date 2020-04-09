package com.x3408.stumanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.x3408.stumanage.mapper")
@SpringBootApplication
public class StumanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StumanageApplication.class, args);
    }

}
