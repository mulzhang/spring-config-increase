package com.example.demo;

import com.example.demo.service.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo6Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo6Application.class, args);
    }


    @Bean
    public Use use(@Qualifier("BUser") User user){
        return new Use(user);
    }

}
