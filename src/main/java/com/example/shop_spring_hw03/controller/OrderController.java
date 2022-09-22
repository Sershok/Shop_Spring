package com.example.shop_spring_hw03.controller;

import com.example.shop_spring_hw03.model.Order;
import com.example.shop_spring_hw03.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/order")
@RestController
public class OrderController {

    @Autowired
    private IOrderService orderService;


    @GetMapping("/get_order_{id}_'{name}'")
    public Order findByName(@PathVariable String id, @PathVariable String name){
        return orderService.findByName(id, name);
    }

    @GetMapping("/put_product_{idPerson}_'{nameProduct}'")
    public Order addOrder(@PathVariable String idPerson, @PathVariable String nameProduct){
        return orderService.creatOrder(idPerson,nameProduct);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable String id){
        orderService.deleteById(id);
    }

}
