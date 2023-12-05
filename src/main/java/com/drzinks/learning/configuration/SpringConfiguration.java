package com.drzinks.learning.configuration;

import com.drzinks.learning.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfiguration {

    @Bean
    public List<Person> people() {
     return new ArrayList<>(Arrays.asList(
                new Person("Michal", "Golebiowski", 41),
                new Person("Maciej", "Golebiowski", 41),
                new Person("Maciej", "Golebiowski", 44),
                new Person("Maciej", "Golebiowski", 33),
                new Person("Jaroslaw", "Pigula", 38),
                new Person("Jaroslaw", "Pigula", 34),
                new Person("Maciej", "Buczek", 41),
                new Person("Janusz", "Komorowski", 53)
        ));
    }

}
