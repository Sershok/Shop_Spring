package com.example.shop_spring_hw03.services;

import com.example.shop_spring_hw03.model.Cart;


public interface ICartService {


    Cart findByName(String id,String name);

    Cart creatCart(String idPerson,int idOrder);

    void deleteById(String id);


}
