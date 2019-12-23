package com.huan.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author huanfuan
 * @Date 2019/12/23 23:24
 * @Version 1.0
 */

@RestController
public class HelloController {


    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello")
    public String say(){
        return" 说明： "+limitConfig.getDescription();
    };
}