package com.example.rabbitmq.producer_service.producerSendMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQController {

    @Autowired
    private RabbitMQProducer producer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        producer.sendMessage(message);
        return "Message sent to RabbitMQ: " + message;
    }
}
