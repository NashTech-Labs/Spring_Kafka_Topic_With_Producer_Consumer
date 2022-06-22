package com.knoldus.springbootkafkaIntegration.apachekafkaSpringBoot;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Kafka Integration with SpringBoot
 * producers publish real-time messages into Kafka servers.
 * Created by IntelliJ IDEA.
 * User: shashikant
 * Date: 23/06/2022
 */
@Service
public class Producer {

    private static final String TOPIC = "test_topic2";


    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){

        this.kafkaTemplate.send(TOPIC,message);
    }

    @Bean
    public NewTopic createTopic(){

        return new NewTopic(TOPIC,3,(short) 1);
    }



}