package com.perfume.model;

import lombok.Data;

@Data
public class ProductModel {
    private int productId;
    private String productName;
    private double price;
    private int stock;
}
