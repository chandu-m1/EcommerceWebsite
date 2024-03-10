package com.ecommerce.chandu.services;

import com.ecommerce.chandu.Models.User;
import com.ecommerce.chandu.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveToDb
{
    @Autowired
    UserRepository userRepository;
    public void save(User user)
    {
        userRepository.save(user);
    }
    public double findByName(String name)
    {
        User user = userRepository.findByName(name);
        return user.salary;
    }
}
