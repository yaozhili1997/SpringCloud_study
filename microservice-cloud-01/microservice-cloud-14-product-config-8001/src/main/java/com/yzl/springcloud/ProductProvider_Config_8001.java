package com.yzl.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: 姚志立
 * @Date: 2020/4/27 17:33
 * @Version: 1.0
 */
@MapperScan("com.yzl.springcloud.mapper")
@EnableEurekaClient
@SpringBootApplication
public class ProductProvider_Config_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_Config_8001.class,args);
    }
}
