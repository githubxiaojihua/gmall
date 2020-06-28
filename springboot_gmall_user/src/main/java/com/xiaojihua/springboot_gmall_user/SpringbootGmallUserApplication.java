package com.xiaojihua.springboot_gmall_user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = {"com.xiaojihua.springboot_gmall_user"})
public class SpringbootGmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGmallUserApplication.class, args);
    }

}
