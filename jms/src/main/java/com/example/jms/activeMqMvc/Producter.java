package com.example.jms.activeMqMvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.jms.Queue;
import javax.jms.Topic;


@RestController
public class Producter {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue sendQueue;
    @Autowired
    private Topic sendTopic;

    @GetMapping("/sendMess")
    public void insertVisitLog() {
        try {
            logger.info("insertVisitLog :收到请求，--123987");
            jmsMessagingTemplate.convertAndSend(sendQueue, "123987");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @GetMapping("/sendMessTop")
    public void sendMessTop() {
        try {
            logger.info("insertVisitLog :收到请求--zxcvbn");
            jmsMessagingTemplate.convertAndSend(sendTopic, "zxcvbn");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

