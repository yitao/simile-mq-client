package com.simile.mq.client.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by yitao on 2018/11/30.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class ClientMain {

    public static void main(String[] args) {
        SpringApplication.run(ClientMain.class, args);
    }
}
