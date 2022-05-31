package com.wwq.worklite.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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


    @RequestMapping("/test")
    @ApiOperation(value = "test",notes = "test")
    @ResponseBody
    public String test(){
        return "hello word!";
    }
}
