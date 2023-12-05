package com.drzinks.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.TreeSet;

@SpringBootApplication
public class Reminder implements CommandLineRunner {

    private PersonReversedOrderComparator reversedComparator;
    private List<Person> people;

    @Autowired
    public Reminder(PersonReversedOrderComparator reversedComparator, List<Person> people) {
        this.reversedComparator = reversedComparator;
        this.people = people;
    }

    private static Logger LOG = LoggerFactory.getLogger(Reminder.class);
    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(Reminder.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws Exception {


        TreeSet<Person> peopleSet = new TreeSet<>(people);
        peopleSet.forEach(System.out::println);

        Person person1 = new Person("Michal", "Golebiowski", 41);
        Person person2 = new Person("Michal", "Golebiowsk", 41);
        System.out.println(person1.equals(person2));
        people.sort(reversedComparator);
        people.forEach(person-> System.out.println(person));
    }
}