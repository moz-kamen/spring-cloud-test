package com.kamen.moz.service.impl;

import com.kamen.moz.feign.UserService;
import com.kamen.moz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    @Override
    public String checkUser(String id) {
        return userService.getUserNameById(id);
    }
}
