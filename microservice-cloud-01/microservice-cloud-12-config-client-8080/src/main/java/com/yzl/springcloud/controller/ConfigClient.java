package com.yzl.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚志立
 * @Date: 2020/4/27 15:52
 * @Version: 1.0
 */

@RestController
public class ConfigClient {
    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name")
    private String applicationName;

    @GetMapping("/config")
    public String config(){
        String content="application:"+applicationName+",port:"+port;
        System.out.println(content);
        return content;
    }
}
