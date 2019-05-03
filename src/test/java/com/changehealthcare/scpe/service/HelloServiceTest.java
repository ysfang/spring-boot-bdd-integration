package com.changehealthcare.scpe.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class HelloServiceTest {
    HelloService helloService = new HelloService();

    @Test
    public void testPrintUserName() {
        assertThat(helloService.getHello()).isEqualTo("Hello");
    }
}