package com.kamen.moz.controller;

import com.kamen.moz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/checkUser",method=RequestMethod.GET)
    public String checkUser(@RequestParam String id){
        return orderService.checkUser(id);
    }
}
