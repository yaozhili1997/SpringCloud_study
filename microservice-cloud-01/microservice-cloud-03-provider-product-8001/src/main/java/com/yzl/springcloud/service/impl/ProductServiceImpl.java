package com.yzl.springcloud.service.impl;

import com.yzl.springcloud.entities.Product;
import com.yzl.springcloud.mapper.ProductMapper;
import com.yzl.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 姚志立
 * @Date: 2020/4/16 16:58
 * @Version: 1.0
 */

@Service //一定不要少了
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }

}
