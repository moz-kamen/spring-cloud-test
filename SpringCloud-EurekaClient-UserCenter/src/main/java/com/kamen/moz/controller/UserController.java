package com.kamen.moz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @RequestMapping(value="/name",method=RequestMethod.GET)
    public String getUserNameById(@RequestParam String id){
        return id + " : xuliang";
    }
}
