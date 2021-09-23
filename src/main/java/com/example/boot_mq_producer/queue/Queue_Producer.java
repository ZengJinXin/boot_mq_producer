package com.example.boot_mq_producer.queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Queue_Producer {
    //JmsMessagingTemplate是Springboot的Jms模板,Spring的是JmsTemplate
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    //把ConfigBean类的ActiveMQQueue注入进来
    @Autowired
    private ActiveMQQueue activeMQQueue;
    public void producerMsg() {
        jmsMessagingTemplate.convertAndSend(activeMQQueue, "**************" + UUID.randomUUID().toString());
    }
    //表示每三秒执行一次
    @Scheduled(fixedDelay = 3000)
    public void producerMessageScheduled(){
        producerMsg();
    }
}
