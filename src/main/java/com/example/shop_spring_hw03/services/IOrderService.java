package com.example.shop_spring_hw03.services;


import com.example.shop_spring_hw03.model.Order;


public interface IOrderService {



    Order findByName(String id,String name);

    Order creatOrder(String idPerson, String nameProduct);

    void deleteById(String id);

}
