package com.example.springbootmybaitsplus.model;

import lombok.Data;

/**
 * @author huanfuan
 * @version 1.0
 * @date 2019/12/26 0026 上午 11:20
 */

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
