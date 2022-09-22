package com.example.shop_spring_hw03.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Setter
@Getter
public class Order {


    private String nameProduct;
    private Double price;
    private String idPerson;
    private String personName;
    private Integer idOrder;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return idPerson.equals(order.idPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPerson);
    }
}
