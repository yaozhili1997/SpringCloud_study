package com.yzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: 姚志立
 * @Date: 2020/4/27 15:34
 * @Version: 1.0
 */

@EnableConfigServer
@SpringBootApplication
public class ConfigServer_5001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001.class, args);
    }
}
