package com.example.rabbitmq.consumer_service.configuration;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@Component
public class RabbitMQConfig {

    @RabbitListener(queues = "myQueue")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}