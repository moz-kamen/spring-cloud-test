package com.kamen.moz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @ApiOperation(value="获取用户姓名", notes="根据用户的id来获取用户姓名")
    @RequestMapping(value="/name",method=RequestMethod.GET)
    public String getUserNameById(@RequestParam String id){
        return id + " : xuliang";
    }

    @ApiOperation(value="获取用户信息", notes="测试json请求响应")

    @ResponseBody
    @RequestMapping(value="/info",method=RequestMethod.POST)
    public Map<String,Object> getUser(@RequestBody Map<String, Object> requestJson) {
        return requestJson;
    }
}
