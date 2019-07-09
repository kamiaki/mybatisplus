package com.aki.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aki.mybatisplus.mapper")
public class MybatisplusApplication {
    private static final Logger logger = LoggerFactory.getLogger(MybatisplusApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusApplication.class, args);
        logger.info("========================启动完毕========================");
    }

}
