package com.brady.demo.controller;

import com.brady.demo.entity.BaseEntity;
import com.brady.demo.service.ConsumeService;
import com.brady.demo.service.SpringCloudService;
import com.brady.demo.service.TestServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    ConsumeService consumeService;

    @Autowired
    TestServiceClient testServiceClient;

    @Autowired
    SpringCloudService springCloudService;

    @Value("${my.name}")
    private String name;
    @GetMapping("/getService")
    public String comsumption(String type) {
        System.out.println(name);
        return consumeService.callService(type);
    }

    @GetMapping("/testFeign")
    @ResponseBody
    public BaseEntity testFeign(String type) {
        System.out.println(type);
        return testServiceClient.getByType(type);
    }

    // 服务消费者对位提供的服务
    @GetMapping(value = "/search/github")
    public ResponseEntity<byte[]> searchGithubRepoByStr(@RequestParam("str") String queryStr) {
        return springCloudService.searchRepo(queryStr);
    }
}
