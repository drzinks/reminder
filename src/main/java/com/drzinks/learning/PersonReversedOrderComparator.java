package com.drzinks.learning;

import org.springframework.stereotype.Component;

import java.util.Comparator;

@Component
public class PersonReversedOrderComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if (person1.surname().compareTo(person2.surname()) == 0) {
            if (person1.name().compareTo(person2.name()) == 0) {
                return person2.age() - person1.age();
            }
            return person2.name().compareTo(person1.name());
        }
        return person2.surname().compareTo(person1.surname());
    }

}
