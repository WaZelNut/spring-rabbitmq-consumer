package com.kleon.springmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void Listener(CustomMessage message) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(message);
    }

}
