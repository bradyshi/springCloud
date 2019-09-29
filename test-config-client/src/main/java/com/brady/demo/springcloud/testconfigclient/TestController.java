package com.brady.demo.springcloud.testconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ConsumeService consumeService;

    @Value("${my.name}")
    private String name;
    @GetMapping("/getService")
    public String comsumption(String type) {
        System.out.println(name);
        return consumeService.callService(type);
    }
}
