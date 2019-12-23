package com.huan.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @Author huanfuan
 * @Date 2019/12/24 1:42
 * @Version 1.0
 */
@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;


    /*
    * 事务 指数据库事务
    * */
    @Transactional
    public void createTwo(){
        Luckymoney luckymoney1=new Luckymoney();
        luckymoney1.setProducer("廖师兄");
        luckymoney1.setMoney(new BigDecimal("520"));
        repository.save(luckymoney1);


        Luckymoney luckymoney2=new Luckymoney();
        luckymoney2.setProducer("廖师兄");
        luckymoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckymoney2);

    }
}
