package com.my.service;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.my.service.config.dao.UserRepository;
import com.my.service.config.dao.model.User;

@SpringBootApplication
@EntityScan(basePackageClasses = { SpringBootWinOneApplication.class, Jsr310JpaConverters.class })
public class SpringBootWinOneApplication {
    private static final Logger log = LoggerFactory.getLogger(SpringBootWinOneApplication.class);
    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWinOneApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(final UserRepository repository) {
        return (args) -> {
            // save a few users
//            final String password = "$2a$10$fk0z45vDYLNv8ca7fa7ZlO8O1pGyWoBXxgjgsrPGGZLUIZB3EB4xC";
//            repository.save(new User("Allen Watts", "user", "user@mail.com", password));
//            repository.save(new User("John Smith", "admin", "admin@mail.com", password));

            log.info("All users with findAll():");
            log.info("-------------------------------");
            for (User user : repository.findAll()) {
              log.info(user.toString());
            }
        };
    }
}