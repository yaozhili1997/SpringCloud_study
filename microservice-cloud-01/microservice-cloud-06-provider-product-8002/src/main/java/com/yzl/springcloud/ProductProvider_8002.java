package com.yzl.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: 姚志立
 * @Date: 2020/4/16 17:03
 * @Version: 1.0
 */
@EnableEurekaClient//将此服务注册到Eureka服务注册中心
@MapperScan("com.yzl.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8002 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8002.class, args);
    }

}
