package com.paresh.ecommerce.inventory.service.Dto;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;

    private String title;

    private Double price;

    private Integer stock;

}
