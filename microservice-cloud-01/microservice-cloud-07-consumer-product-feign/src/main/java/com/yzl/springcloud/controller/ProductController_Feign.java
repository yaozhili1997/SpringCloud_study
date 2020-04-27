package com.yzl.springcloud.controller;

import com.yzl.springcloud.entities.Product;
import com.yzl.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: 姚志立
 * @Date: 2020/4/16 17:19
 * @Version: 1.0
 */
@RestController
public class ProductController_Feign {
    @Autowired
    ProductClientService service;
    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product){
        return service.add(product);
}
    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id")Long id){
        return service.get(id);
    }
    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list(){
        return service.list();
    }
}
