package com.nestedsoftware.springbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DisplayRecordsInDatabase {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Bean
    public CommandLineRunner displayData(UserRepository userRepository) {
        List<User> users = userRepository.findAll();
        return args -> {
            for (User user : users) {
                log.info(user.toString());
            }
        };
    }
}
