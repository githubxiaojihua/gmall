package com.xiaojihua.springboot_gmall_order;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = {"com.xiaojihua.springboot_gmall_order"})
@SpringBootApplication
public class SpringbootGmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGmallOrderApplication.class, args);
    }

}
