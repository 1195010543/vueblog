package com.markerhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VueblogApplication {

    public static void main(String[] args) {

        SpringApplication.run(VueblogApplication.class, args);
        System.out.println("已经执行了启动服务！");
    }

}
