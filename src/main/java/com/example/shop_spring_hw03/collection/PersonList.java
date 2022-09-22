package com.example.shop_spring_hw03.collection;

import com.example.shop_spring_hw03.model.Person;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class PersonList {

    public Set<Person> persons = new HashSet<>();

}
