package com.example.shop_spring_hw03.services;

import com.example.shop_spring_hw03.model.Person;

public interface IPersonService {
    String creatPerson(Person person);

    Person findById(String id);

    void deleteById(String id);
}
