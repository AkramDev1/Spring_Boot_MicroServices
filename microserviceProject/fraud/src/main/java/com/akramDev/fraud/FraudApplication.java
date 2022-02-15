package com.akramDev.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableAutoConfiguration
public class FraudApplication {
    public static void main(String[] args){
        SpringApplication.run(FraudApplication.class, args);
    }
}
