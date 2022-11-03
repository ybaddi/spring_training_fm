package com.example.example_spring_boot_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v2/student")
public class StudentController {
    @GetMapping("/")
    public List<Student> hello(){

//        List.of();
        List result = new ArrayList<>();
        result.add(
                new Student(
                        1L,
                        "baddi",
                        "baddi.y@ucd.ac.ma",
                        LocalDate.of(1990,1,1),
                        26
                )
        );

        result.add(
                new Student(
                        2L,
                        "baddi",
                        "baddi.y@ucd.ac.ma",
                        LocalDate.of(1990,1,1),
                        26
                )
        );

        result.add(
                new Student(
                        3L,
                        "baddi",
                        "baddi.y@ucd.ac.ma",
                        LocalDate.of(1990,1,1),
                        26
                )
        );

        result.add(
                new Student(
                        6L,
                        "baddi",
                        "baddi.y@ucd.ac.ma",
                        LocalDate.of(1990,1,1),
                        26
                )
        );
        return result;
    }
}
