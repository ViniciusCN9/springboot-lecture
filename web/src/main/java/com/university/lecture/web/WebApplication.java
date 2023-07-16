package com.university.lecture.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.university.lecture"})
@EnableJpaRepositories(basePackages = {"com.university.lecture.domain.repositories"})
@EntityScan(basePackages = {"com.university.lecture.domain.entities"})
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
      }

}
