package com.wwq.worklite.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author wwq
 * @version 1.0
 * @description: TODO
 * @date 5/31/22 5:06 PM
 */
@RestController
@RequestMapping("/test")
@EnableOpenApi
public class TestController {


    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @RequestMapping("/test")
    @ApiOperation(value = "test",notes = "test", httpMethod = "POST")
    @ResponseBody
    public String test(){

        String key = "zszxz";
        String value = "知识追寻者";
        redisTemplate.opsForValue().set(key, value);
        return "hello word!";
    }
    @RequestMapping("/test2")
    @ApiOperation(value = "test2",notes = "test2", httpMethod = "POST")
    @ResponseBody
    public String test2(){

        String key = "zszxz";
        Object value = redisTemplate.opsForValue().get(key);
        // 知识追寻者
        System.out.println(value);
        return "hello word!";
    }
}
