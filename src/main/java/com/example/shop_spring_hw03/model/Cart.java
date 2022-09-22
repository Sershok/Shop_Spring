package com.example.shop_spring_hw03.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cart {

    private String id;
    private String personName;

    private String nameProduct;
    private Double sum;


}
