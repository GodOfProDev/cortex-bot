package me.kodysimpson.cortexbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(
        scanBasePackages = {"me.kodysimpson.cortexbot.*", "dev.mikka.cortexbot.*"}
)
@EnableScheduling
public class CortexBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(CortexBotApplication.class, args);
    }

}
