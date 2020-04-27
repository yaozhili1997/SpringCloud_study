package com.yzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: 姚志立
 * @Date: 2020/4/27 17:25
 * @Version: 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_Config_6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_Config_6001.class, args);
    }
}
