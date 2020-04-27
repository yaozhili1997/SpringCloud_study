package com.yzl.springcloud.service;

import com.yzl.springcloud.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: 姚志立
 * @Date: 2020/4/26 16:13
 * @Version: 1.0
 */

/*ProductClientServiceFallBack作用，指定熔断处理类，如果被调用的方法处理异常，就会交给熔断处理类中的方法进行处理*/
@FeignClient(value = "microservice-product",fallback = ProductClientServiceFallBack.class)//指定调用的微服务名称
public interface ProductClientService {
    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    boolean add(@RequestBody Product product);

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable("id") Long id);

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Product> list();

}
