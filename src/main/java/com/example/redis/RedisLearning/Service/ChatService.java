package com.example.redis.RedisLearning.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ChatService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    private static final String CHAT_HISTORY_KEY = "chat_history";

    public void storeMessage(String message) {
        redisTemplate.opsForList().leftPush(CHAT_HISTORY_KEY, message);
    }

    public List<String> getChatHistory() {
        return redisTemplate.opsForList().range(CHAT_HISTORY_KEY, 0, -1);
    }
}
