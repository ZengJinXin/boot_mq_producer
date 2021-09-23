package com.example.boot_mq_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//开启定时任务调度功能
@EnableScheduling
public class BootMqProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMqProducerApplication.class, args);
    }

}
