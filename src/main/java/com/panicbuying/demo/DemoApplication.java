package com.panicbuying.demo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

// 定义扫描MyBatis接口
@MapperScan(basePackages = "com.panicbuying.demo")
@EnableScheduling
@SpringBootApplication(scanBasePackages = "com.panicbuying.demo")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
