package org.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "topic1", groupId = "demo-group")
    public void consume(String message){
        System.out.println("Consumed Message... : " + message);
    }
}
