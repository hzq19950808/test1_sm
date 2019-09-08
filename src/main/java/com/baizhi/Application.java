package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("==========================================================");
        //启动SpringBoot内部的容器
        SpringApplication.run(Application.class,args);
        System.out.println("111111");
    }
}
