package com.example.shop_spring_hw03.collection;

import com.example.shop_spring_hw03.model.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderList {

    public List<Order> orderList = new ArrayList<>();


}
