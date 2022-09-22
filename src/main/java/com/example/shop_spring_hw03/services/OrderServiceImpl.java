package com.example.shop_spring_hw03.services;

import com.example.shop_spring_hw03.collection.ItemList;
import com.example.shop_spring_hw03.collection.OrderList;
import com.example.shop_spring_hw03.collection.PersonList;
import com.example.shop_spring_hw03.model.Item;
import com.example.shop_spring_hw03.model.Order;
import com.example.shop_spring_hw03.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private PersonList personList;
    @Autowired
    private OrderList orderList;
    @Autowired
    private ItemList itemList;

    Person person;
    Item item;
    static int countCart = 0;

    @Override
    public Order findByName(String id, String name) {
        return orderList.orderList.stream().filter(str -> Objects.equals(str.getPersonName(), name)).filter(str -> Objects.equals(str.getIdOrder(), id)).findAny().get();

    }

    @Override
    public Order creatOrder(String idPerson, String nameProduct) {
        Order newOrder = new Order();

        person = personList.persons.stream().filter(str -> Objects.equals(str.getId(), idPerson)).findAny().get();
        item = itemList.items.stream().filter(str -> Objects.equals(str.getName(), nameProduct)).findAny().get();



        newOrder.setIdOrder(countCart += 1);
        newOrder.setNameProduct(item.getName());
        newOrder.setPrice(item.getPrice());
        newOrder.setIdPerson(person.getId());
        newOrder.setPersonName(person.getFirstName());
        orderList.orderList.add(newOrder);

        return orderList.orderList.stream()
                .filter(str -> Objects.equals(str.getPersonName(), newOrder.getPersonName()))
                .filter(str -> Objects.equals(str.getNameProduct(), newOrder.getNameProduct()))
                .findAny()
                .get();
    }

    @Override
    public void deleteById(String id) {
        orderList.orderList.removeIf(order -> Objects.equals(order.getIdOrder(),id));
    }


}
