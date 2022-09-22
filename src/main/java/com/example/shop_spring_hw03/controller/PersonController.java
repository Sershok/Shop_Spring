package com.example.shop_spring_hw03.controller;

import com.example.shop_spring_hw03.model.Person;
import com.example.shop_spring_hw03.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/person")
@RestController
public class PersonController {

    @Autowired
    private IPersonService personService;

    @PostMapping("/create")
    public String createPerson(@RequestBody Person person){
        return personService.creatPerson(person);
    }

    @GetMapping("/get_person_{id}")
    public Person FindById(@PathVariable String id){

        return personService.findById(id);

    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable String id){
        personService.deleteById(id);
    }

}
