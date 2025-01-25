package com.chat.controller;

import com.chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // Matches /app/sendMessage
    @SendTo("/topic/messages") // Sends messages to /topic/messages
    public ChatMessage sendMessage(ChatMessage message) {
        System.out.println("Message received: " + message); // Debugging log
        return message;
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }
}
