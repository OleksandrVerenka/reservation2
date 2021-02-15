package com.example.reservation2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Reservation2Application {

    public static void main(String[] args) {
        SpringApplication.run(Reservation2Application.class, args);
    }

}
