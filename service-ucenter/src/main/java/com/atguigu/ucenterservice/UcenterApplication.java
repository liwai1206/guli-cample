package com.atguigu.ucenterservice;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.atguigu"})
@MapperScan(basePackages = {"com.atguigu.ucenterservice.mapper"})
public class UcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run( UcenterApplication.class, args );
    }

}
