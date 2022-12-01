package com.perfume.mapper;

import com.perfume.dto.ProductDTO;
import com.perfume.model.ProductModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<ProductModel> findAll();

    ProductModel findById(int productId);


}
