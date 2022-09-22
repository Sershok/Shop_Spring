package com.example.shop_spring_hw03.services;

import com.example.shop_spring_hw03.collection.ItemList;
import com.example.shop_spring_hw03.model.Cart;
import com.example.shop_spring_hw03.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ItemServiceImpl implements IItemService {

    @Autowired
    private ItemList itemList;

    Cart cart;
    @Override
    public String createItem(Item item) {

        Item newItem = new Item();
        newItem.setName(item.getName());
        newItem.setPrice(item.getPrice());
        itemList.items.add(item);

        return newItem.getName();


    }

    @Override
    public Item findByName(String name) {
        return itemList.items.stream().filter(item -> Objects.equals(item.getName(), name)).findAny().get();
    }

    @Override
    public void deleteById(String id) {
        itemList.items.removeIf(item -> Objects.equals(item.getId(),id));
    }
}
