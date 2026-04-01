package com.example.AI_powered.chatbot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ChatService {

    @Value("${openai.api.key}")
    private String apiKey;

    private final String API_URL = "https://api.openai.com/v1/chat/completions";

    public String getChatResponse(String userMessage) {

        try {
            RestTemplate restTemplate = new RestTemplate();

            Map<String, Object> request = new HashMap<>();
            request.put("model", "gpt-4o-mini");

            Map<String, String> message = new HashMap<>();
            message.put("role", "user");
            message.put("content", userMessage);

            request.put("messages", new Object[]{message});

            org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
            headers.set("Authorization", "Bearer " + apiKey);
            headers.set("Content-Type", "application/json");

            org.springframework.http.HttpEntity<Map<String, Object>> entity =
                    new org.springframework.http.HttpEntity<>(request, headers);

            Map response = restTemplate.postForObject(API_URL, entity, Map.class);

            // Extract reply
            var choices = (java.util.List<Map>) response.get("choices");
            var firstChoice = choices.get(0);
            var messageMap = (Map) firstChoice.get("message");

            return messageMap.get("content").toString();

        } catch (Exception e) {
            e.printStackTrace(); // logs error in console

            return "⚠️ AI service not available. Please check API quota or try later.";
        }
    }
}