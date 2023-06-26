package com.example.chatApp.service;

import com.example.chatApp.dto.Message;
import com.example.chatApp.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;

    public List<Message> fetchAllMessages() {
        return messageRepository.findAll();
    }

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }
}
