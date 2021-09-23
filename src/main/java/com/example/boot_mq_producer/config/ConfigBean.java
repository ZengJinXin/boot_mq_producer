package com.example.boot_mq_producer.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class ConfigBean {
    @Value("${myQueueName}")
    private String myQueue;
    @Bean
    public ActiveMQQueue queue(){
        //创建一个ActiveMQQueue
        return new ActiveMQQueue(myQueue);
    }
}
