package io.lc.learning.springboot.activemq.provider.controller;

import io.lc.learning.springboot.activemq.provider.service.Provider;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lph
 */
@RestController
@RequestMapping("activemq")
@AllArgsConstructor
public class ActiveMqController {

    private Provider provider;

    @RequestMapping("test/{msg}")
    public void test(@PathVariable String msg) {
        provider.sendMessage(msg);
    }
}
