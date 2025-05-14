package org.DSA.HashMap;

import java.util.Objects;

public class Person {
    String name;
    int age ;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Same hash code for p1 and p2
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name); // Equal based on name and age
    }
}
