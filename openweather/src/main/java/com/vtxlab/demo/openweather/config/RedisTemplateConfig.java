package com.vtxlab.demo.openweather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.vtxlab.demo.openweather.model.currentweather.CurrentWeatherResponse;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisTemplateConfig {

  @Bean(name = "redisTemplate")
  public RedisTemplate<String, CurrentWeatherResponse> redisTemplate(
      RedisConnectionFactory connectionFactory) {
    RedisTemplate<String, CurrentWeatherResponse> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(connectionFactory);
    StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
    redisTemplate.setKeySerializer(stringRedisSerializer);
    // Add some specific configuration here. Key serializers, etc.
    return redisTemplate;
  }

}
