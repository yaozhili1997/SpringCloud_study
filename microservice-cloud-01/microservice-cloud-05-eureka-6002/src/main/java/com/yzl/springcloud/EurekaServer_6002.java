package com.yzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: 姚志立
 * @Date: 2020/4/17 9:33
 * @Version: 1.0
 */
@EnableEurekaServer //标识一个Eureka Server 服务注册中心
@SpringBootApplication
public class EurekaServer_6002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6002.class, args);
    }
}
