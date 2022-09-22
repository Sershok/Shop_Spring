package com.example.shop_spring_hw03.collection;

import com.example.shop_spring_hw03.model.Cart;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CartList {

    public List<Cart> cartList = new ArrayList<>();

}
