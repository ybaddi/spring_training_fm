package com.example.example_spring_boot_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExampleSpringBoot1Application {

    public static void main(String[] args) {

        SpringApplication.run(ExampleSpringBoot1Application.class, args);
    }



}
