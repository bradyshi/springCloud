package com.brady.demo.service;

import com.brady.demo.entity.BaseEntity;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumeService {

    @Value("${app.service-url}")
    private String appServiceUrl;

    @Autowired
    private RestTemplate restTemplate;

    public String callService(String type) {
        ResponseEntity responseEntity = restTemplate.postForEntity(appServiceUrl + "getService/" + type, null, BaseEntity.class);
        return ((BaseEntity)responseEntity.getBody()).toString();
    }
}
