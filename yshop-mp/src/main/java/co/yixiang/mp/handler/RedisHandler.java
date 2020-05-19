/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co

 */
package co.yixiang.mp.handler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;


@Component
public class RedisHandler{

    @Autowired
    RedisTemplate redisTemplate;


    public String getVal(String key) {
        try {
            String value = redisTemplate.opsForValue().get(key).toString();
            return value;
        }catch (Exception e){
            return "";
        }
    }


    public Object getObj(String key) {
        return redisTemplate.opsForValue().get(key);
    }


}
