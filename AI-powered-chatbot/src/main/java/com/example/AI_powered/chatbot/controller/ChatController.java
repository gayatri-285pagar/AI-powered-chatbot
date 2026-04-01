package com.example.AI_powered.chatbot.controller;

import com.example.AI_powered.chatbot.model.ChatRequest;
import com.example.AI_powered.chatbot.model.ChatResponse;
import com.example.AI_powered.chatbot.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/chat")
    public ChatResponse chat(@RequestBody ChatRequest request) {
        String reply = chatService.getChatResponse(request.getMessage());

        ChatResponse response = new ChatResponse();
        response.setReply(reply);

        return response;
    }
}
