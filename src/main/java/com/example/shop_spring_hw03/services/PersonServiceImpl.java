package com.example.shop_spring_hw03.services;

import com.example.shop_spring_hw03.collection.PersonList;
import com.example.shop_spring_hw03.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    private PersonList personList;


    @Override
    public String creatPerson(Person person) {
        Person newPerson = new Person();

        newPerson.setId(person.getId());
        newPerson.setFirstName(person.getFirstName());
        newPerson.setLastName(person.getLastName());
        newPerson.setEmail(person.getEmail());
        personList.persons.add(person);

        return newPerson.getFirstName();
    }

    @Override
    public Person findById(String id) {

        return personList.persons.stream().filter(person -> Objects.equals(person.getId(), id)).findAny().get();
    }

    @Override
    public void deleteById(String id) {
       personList.persons.removeIf(p->Objects.equals(p.getId(),id));
    }
}
