package com.example.chatApp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Message {

    private String sender;
    private String message;

    private Date datetime;
}
