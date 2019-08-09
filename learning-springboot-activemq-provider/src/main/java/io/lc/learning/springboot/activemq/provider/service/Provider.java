package io.lc.learning.springboot.activemq.provider.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @author lph
 */
@Slf4j
@Component
@AllArgsConstructor
public class Provider {

    private JmsTemplate jmsTemplate;

    public void sendMessage(String msg) {
        log.info("prepared to send msg: {}", msg);
        jmsTemplate.setDefaultDestinationName("destination_test");
        jmsTemplate.send(session -> session.createTextMessage(msg));
    }
}
