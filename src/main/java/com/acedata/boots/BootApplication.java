package com.acedata.boots;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
@MapperScan("com.acedata.boots.mapper")
@EntityScan("com.acedata.boots.domain.ext")
public class BootApplication {

    public static void main(String[] args) {

        SpringApplication.run(BootApplication.class, args);

    }

}
