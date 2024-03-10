package com.ecommerce.chandu.controllers;

import com.ecommerce.chandu.Models.User;
import com.ecommerce.chandu.services.SaveToDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    SaveToDb saveToDb;

    HelloController(SaveToDb saveToDb)
    {
        this.saveToDb = saveToDb;
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "applications working. hello world";
    }
     @PostMapping("/")
     public  String addUser(@RequestBody User user)
     {
         System.out.print(user.name);
         saveToDb.save(user);
         return "data inserted";
     }
     @GetMapping("/users/{name}")
     public double getSalary(@PathVariable String name)
     {
         double sal = saveToDb.findByName(name);
         return sal;
     }
}
