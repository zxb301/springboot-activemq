package com.example.jmscust;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;


@Service
public class ConsumerListener {
    Logger logger = LoggerFactory.getLogger(getClass());
    @JmsListener(destination="queue",containerFactory = "jmsListenerContainerQueue")
    public void queue(String str){
        try {
            logger.info("接受到消息 : "+str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @JmsListener(destination="topic",containerFactory = "jmsListenerContainerTopic")
    public void topic(String str){
        try {
            logger.info("接受到消息 : "+str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
