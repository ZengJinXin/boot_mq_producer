package com.example.boot_mq_producer;

import com.example.boot_mq_producer.queue.Queue_Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes =BootMqProducerApplication.class ) //加载主类
@RunWith(SpringJUnit4ClassRunner.class)//加载spring的junit
@WebAppConfiguration//加载web
public class TestActiveMQ {
    @Autowired
    private Queue_Producer queue_producer;
    @Test
    public void testSend() throws Exception{
        queue_producer.producerMsg();
    }
}
