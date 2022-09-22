package com.example.shop_spring_hw03.services;

import com.example.shop_spring_hw03.collection.CartList;
import com.example.shop_spring_hw03.collection.OrderList;
import com.example.shop_spring_hw03.model.Cart;
import com.example.shop_spring_hw03.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static com.example.shop_spring_hw03.services.OrderServiceImpl.countCart;


@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    private CartList cartList;
    @Autowired
    private OrderList orderList;
    Order order;

    @Override
    public Cart findByName(String id, String name) {

        return cartList.cartList.stream().filter(str -> Objects.equals(str.getPersonName(), name)).filter(str -> Objects.equals(str.getId(), id)).findAny().get();

    }


    @Override
    public Cart creatCart(String idPerson, int idOrder) {
        StringBuilder stringBuilder = new StringBuilder();
        Double sum = 0.0;


        Cart newCart = new Cart();

        for (int i = 0; i < countCart; i++) {

            int finalId = idOrder;
            order = orderList.orderList.stream()
                    .filter(str -> Objects.equals(str.getIdPerson(), idPerson))
                    .filter(str -> Objects.equals(str.getIdOrder(), finalId)).findAny().get();
            stringBuilder.append(order.getNameProduct()).append(" ");
            sum += order.getPrice();
            idOrder += 1;
        }

        newCart.setNameProduct(stringBuilder.toString());
        newCart.setSum(sum);
        newCart.setId(order.getIdPerson());
        newCart.setPersonName(order.getPersonName());

        cartList.cartList.add(newCart);
        System.out.println(stringBuilder);
        System.out.println(sum);
        return cartList.cartList.stream().filter(str -> Objects.equals(str.getNameProduct(), newCart.getNameProduct())).findAny().get();

    }

    @Override
    public void deleteById(String id) {
        cartList.cartList.removeIf(cart -> Objects.equals(cart.getId(),id));
    }
}
