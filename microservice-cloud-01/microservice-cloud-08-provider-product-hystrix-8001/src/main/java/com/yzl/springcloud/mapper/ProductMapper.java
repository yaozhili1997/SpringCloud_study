package com.yzl.springcloud.mapper;

import com.yzl.springcloud.entities.Product;

import java.util.List;

/**
 * @Author: 姚志立
 * @Date: 2020/4/16 16:47
 * @Version: 1.0
 */
//@Mapper//或者在启动类上标识@MapperScan
public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
