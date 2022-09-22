package com.example.shop_spring_hw03.controller;

import com.example.shop_spring_hw03.model.Item;
import com.example.shop_spring_hw03.services.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/item")
@RestController
public class ItemController {
    @Autowired
    private IItemService iItemService;

    @PostMapping("/create")
    public String createItem(@RequestBody Item item) {
        return iItemService.createItem(item);
    }

    @GetMapping("/get_item_'{name}'")
    public Item findByName(@PathVariable String name) {
        return iItemService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable String id){
        iItemService.deleteById(id);
    }

}
