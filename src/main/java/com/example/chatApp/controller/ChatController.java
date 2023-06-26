package com.example.chatApp.controller;

import com.example.chatApp.dto.Message;
import com.example.chatApp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ChatController {

    @Autowired
    MessageService messageService;
    @MessageMapping("/message")
    @SendTo("/chatroom/public")
    @CrossOrigin("*")
    public Message saveMessage(@Payload Message message) {
        return messageService.saveMessage(message);
    }

    @CrossOrigin("*")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/messages",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Message> fetchAllMessages() {
        return messageService.fetchAllMessages();
    }
}
