package com.huan.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @Author huanfuan
 * @Date 2019/12/23 23:24
 * @Version 1.0
 * @Controller+@ResponseBody=@RestController
 */

@RestController
@RequestMapping("/hello")
public class HelloController {


    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say")
    public String say(@RequestParam(value = "id", required = false,defaultValue = "0") Integer id){

//       return" 说明： "+limitConfig.getDescription();
        return "id:"+id;
    };



}
