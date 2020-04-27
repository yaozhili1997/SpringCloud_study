package com.yzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: 姚志立
 * @Date: 2020/4/16 17:51
 * @Version: 1.0
 */


//@EnableFeignClients会扫描指定包下面使用@FeignClient接口
@EnableFeignClients(basePackages = "com.yzl.springcloud.service")
@EnableEurekaClient//标识是一个Eureka客户端
@SpringBootApplication
public class ProductConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80.class,args);
    }
}
