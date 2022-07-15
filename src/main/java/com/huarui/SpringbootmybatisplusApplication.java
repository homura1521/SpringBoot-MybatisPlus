package com.huarui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.huarui.mapper")
public class SpringbootmybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisplusApplication.class, args);
    }

}
