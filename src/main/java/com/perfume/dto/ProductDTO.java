package com.perfume.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class ProductDTO {

    @NotBlank(message = "should not be blank")
    @NotNull
    private int productId;
}
