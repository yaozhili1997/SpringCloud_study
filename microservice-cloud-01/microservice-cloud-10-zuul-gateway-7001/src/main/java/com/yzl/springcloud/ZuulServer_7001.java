package com.yzl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: 姚志立
 * @Date: 2020/4/27 9:08
 * @Version: 1.0
 */

@EnableZuulProxy
@SpringBootApplication
public class ZuulServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer_7001.class,args);
    }
}
