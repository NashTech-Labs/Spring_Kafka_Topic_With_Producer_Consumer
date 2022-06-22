package com.knoldus.springbootkafkaIntegration.apachekafkaSpringBoot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
/**
 * Kafka Integration with SpringBoot
 * Consumer fetch the real-time messages from the respective Kafka servers.
 * Created by IntelliJ IDEA.
 * User: shashikant
 * Date: 23/06/2022
 */
@Service
public class Consumer {

    @KafkaListener(topics = "test_topic2",groupId = "group_id")

    public void consumerMessage(String message){

        System.out.println(message);
    }
}