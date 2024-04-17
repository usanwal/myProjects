package com.client.redis;

import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedisClient {
	
	@Autowired
	public RedissonClient redissonClient;
	
	public void  connect() {
		
		RMap<String, String> s = redissonClient.getMap("sanwal");
		
		System.out.println("age is " +s.get("age"));
	}

}
