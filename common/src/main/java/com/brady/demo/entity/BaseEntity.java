package com.brady.demo.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="基本对象信息", description="基本对象信息")
public class BaseEntity implements Serializable {
    private Long id;
    private String key;
}
