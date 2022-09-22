package com.example.shop_spring_hw03.controller;

import com.example.shop_spring_hw03.model.Cart;
import com.example.shop_spring_hw03.services.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/cart")
@RestController
public class CartController {

    @Autowired
    private ICartService cartService;


    @GetMapping("/get_cart_{id}_'{name}'")
    public Cart findByName(@PathVariable String id, @PathVariable String name) {
        return cartService.findByName(id, name);
    }

    @GetMapping("/create_cart_{idOrder}_{idPerson}")
    public Cart addCart(@PathVariable String idPerson, @PathVariable int idOrder) {
        return cartService.creatCart(idPerson, idOrder);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable String id){
        cartService.deleteById(id);
    }

}
