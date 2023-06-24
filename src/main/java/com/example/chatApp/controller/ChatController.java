package com.example.chatApp.controller;

import com.example.chatApp.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatController {
    @MessageMapping("/message")
    @SendTo("/chatroom/public")
    public Message greeting(@Payload Message message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return message;
    }
}
