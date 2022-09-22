package com.example.shop_spring_hw03.services;

import com.example.shop_spring_hw03.model.Item;


public interface IItemService {

    String createItem(Item item);

    Item findByName(String name);

    void deleteById(String id);

}
