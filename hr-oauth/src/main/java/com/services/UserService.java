package com.services;

import com.devsuperior.hroauth.entities.User;
import com.devsuperior.hroauth.feignclients.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email){
        User user = userFeignClient.findByEmail(email).getBody();
        if (user == null){
            try {
                throw new IllegalAccessException("Email not found");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return user;
    }
}
