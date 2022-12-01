package com.perfume.controller;


import com.perfume.mapper.ProductMapper;
import com.perfume.model.ProductModel;
import com.perfume.vo.ResponseHelper;
import com.perfume.vo.ResponseVO;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Resource
    ProductMapper productMapper;

    @PostMapping("/list/all")
    ResponseVO<List<ProductModel>> listAllProducts() {
        return ResponseHelper.success(productMapper.findAll());
    }

}
