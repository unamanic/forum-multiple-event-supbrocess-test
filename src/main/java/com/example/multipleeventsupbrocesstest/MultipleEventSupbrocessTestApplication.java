package com.example.multipleeventsupbrocesstest;

import org.flowable.engine.RuntimeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MultipleEventSupbrocessTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultipleEventSupbrocessTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(RuntimeService runtimeService){
        return args -> {
            System.out.println("Starting Signal Test");
            runtimeService.startProcessInstanceByKey("signalTestProcess");
            System.out.println("Done Starting Signal Test");
        };
    }

}
