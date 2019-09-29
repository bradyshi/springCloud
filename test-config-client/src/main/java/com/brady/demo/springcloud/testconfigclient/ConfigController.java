package com.brady.demo.springcloud.testconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${my.name}")
    private String myName;

    @GetMapping("/getName")
    public String getName() {
        return myName;
    }
}
