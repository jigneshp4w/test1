package org.expense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        System.out.println("#### starting App");
        ConfigurableApplicationContext appContext = SpringApplication.run(MainApplication.class, args);
        System.out.println("#### App started");
    }

}
