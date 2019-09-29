package com.brady.demo.service;

import com.brady.demo.entity.BaseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="test-server")
public interface TestServiceClient {
    @RequestMapping(value = "/getService/{type}")
    BaseEntity getByType(@PathVariable String type);
}
