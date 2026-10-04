package com.aygo.aygo;

import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AygoApplication {

    public static void main(String[] args) {
        SpringApplication application =
                new SpringApplication(AygoApplication.class);

        application.setDefaultProperties(
                Map.of("server.port",
                        System.getenv().getOrDefault("PORT", "9000")));

        application.run(args);
    }

}
