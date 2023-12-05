package com.drzinks.learning;

public record Person(String name, String surname, Integer age) implements Comparable<Person>{

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }

    @Override
    public int compareTo(Person person2) {
        if(this.surname().compareTo(person2.surname()) == 0){
            if(this.name().compareTo(person2.name()) == 0){
                return this.age() - person2.age();
            }
            return this.name().compareTo(person2.name());
        }
        return this.surname().compareTo(person2.surname());
    }
}
