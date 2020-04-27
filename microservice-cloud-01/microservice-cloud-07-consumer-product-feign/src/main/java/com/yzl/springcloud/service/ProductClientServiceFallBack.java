package com.yzl.springcloud.service;

import com.yzl.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: 姚志立
 * @Date: 2020/4/26 19:57
 * @Version: 1.0
 */
@Component
public class ProductClientServiceFallBack implements ProductClientService{
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id,"id="+id+"无数据--@feignclient&hystrix","无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
