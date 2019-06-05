package com.example.jms.config;


import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

@Configuration
public class MyActiveMqConfig {
    @Bean
    public Queue sendQueue() {
        return new ActiveMQQueue("queue");
    }
    @Bean
    public Topic sendTopic(){
        return new ActiveMQTopic("topic");
    }

}
