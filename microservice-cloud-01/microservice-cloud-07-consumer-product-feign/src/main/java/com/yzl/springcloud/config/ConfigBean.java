package com.yzl.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 姚志立
 * @Date: 2020/4/16 17:17
 * @Version: 1.0
 */
@Configuration//标识配置类
public class ConfigBean {
    //@LoadBalanced实现负载均衡，调用地址IP可以变成服务名,
    //服务名称就是被调用的那个yml配置中的服务名称spring.application.name
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
