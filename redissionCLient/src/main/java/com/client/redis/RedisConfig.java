package com.client.redis;

import org.redisson.Redisson;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {
	
	@Bean
	public RedissonClient connect() {
		Config config = new Config();
		config.useSingleServer()
		  .setAddress("redis://127.0.0.1:6379");
		RedissonClient client = Redisson.create();
		return client;
	}

}
