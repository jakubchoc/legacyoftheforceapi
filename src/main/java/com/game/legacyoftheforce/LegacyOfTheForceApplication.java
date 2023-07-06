package com.game.legacyoftheforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class LegacyOfTheForceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegacyOfTheForceApplication.class, args);
    }

}
