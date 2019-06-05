package com.demo.demo;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Api(value = "/demo",description = "demo controller")
@RestController
@RequestMapping("/demo")
public class WebController {


    @ApiOperation(value = "/demo/1",notes="这是demo1",tags="{tag1,tag2}",response=String.class,httpMethod= "GET")
    @ApiParam(name = "name",value = "libai")
    @GetMapping("/1")
    public String demo1(String name){

        return   name + ":" + new Date().toString();
    }

    @ApiOperation(value = "/demo/2",notes="这是demo2",tags="{tag3,tag4}",response=String.class,httpMethod= "POST")
    @PostMapping("/2")
    public String demo2(String name){

        return   name + ":" + new Date().toString();
    }
}
