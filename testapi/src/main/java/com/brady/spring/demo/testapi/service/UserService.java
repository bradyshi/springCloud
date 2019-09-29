package com.brady.spring.demo.testapi.service;

import com.brady.spring.demo.testapi.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("userService")
public interface UserService {
    UserEntity getUser(Long id);
}
