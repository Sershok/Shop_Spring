package com.example.shop_spring_hw03.collection;

import com.example.shop_spring_hw03.model.Item;
import org.springframework.stereotype.Component;


import java.util.HashSet;
import java.util.Set;

@Component
public class ItemList {

    public Set<Item> items = new HashSet<>();

}
