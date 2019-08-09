package io.lc.learning.springboot.activemq.consumer.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

/**
 * @author lph
 */
@Slf4j
@Component
@AllArgsConstructor
public class Consumer {

    @JmsListener(destination = "destination_test")
    public void receiveMsg(Message message) throws JMSException {
        TextMessage msg = (TextMessage) message;
        log.info("consumer receive: {}", msg.getText());
    }
}
