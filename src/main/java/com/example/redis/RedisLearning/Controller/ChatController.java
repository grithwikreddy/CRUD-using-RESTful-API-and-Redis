package com.example.redis.RedisLearning.Controller;

import com.example.redis.RedisLearning.Service.ChatService;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@Scope(value = "session")
@RestController
@RequestMapping("/api")
public class ChatController {
    public ChatController(){
        System.out.println("Constroctor called");
    }
    @Autowired
    private ChatService chatService;

    @GetMapping(value = "/history")
    public List<String> getChatHistory() {
        return chatService.getChatHistory();
    }

    @PostMapping(value= "/storeMessage")
    public void storeMessage(@RequestParam String sfg, @RequestParam Integer ab){


        // Iterate through the map to get keys and values
System.out.println(sfg+" "+ab);
        chatService.storeMessage(sfg);
    }
    @PutMapping("/change/{id}")
    public void changeMessage(@PathVariable String id){
        System.out.println(id);
    }

}

