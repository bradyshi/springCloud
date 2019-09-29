package com.brady.demo.controller;

import com.brady.demo.entity.BaseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{
    @RequestMapping("getService/{type}")
    @ResponseBody
    public BaseEntity getService(@PathVariable String type) {
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setId(1L);
        baseEntity.setKey("test00000001" + type);
        return baseEntity;
    }
}
