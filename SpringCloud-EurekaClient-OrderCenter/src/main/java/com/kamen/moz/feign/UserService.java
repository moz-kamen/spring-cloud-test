package com.kamen.moz.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="user-center")
public interface UserService {

    @RequestMapping(value="/user/name",method=RequestMethod.GET)
    public String getUserNameById(@RequestParam(value="id") String id);
}
