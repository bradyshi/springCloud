package com.brady.spring.demo.testapi.entity;

import com.brady.demo.entity.BaseEntity;
import lombok.Data;

@Data
public class UserEntity extends BaseEntity {
    private String userName;
}
