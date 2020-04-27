package com.yzl.springcloud.service;

import com.yzl.springcloud.entities.Product;

import java.util.List;

/**
 * @Author: 姚志立
 * @Date: 2020/4/16 16:58
 * @Version: 1.0
 */
public interface ProductService {
    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
