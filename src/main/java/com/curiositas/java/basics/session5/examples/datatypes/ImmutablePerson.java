package com.curiositas.java.basics.session5.examples.datatypes;

public class ImmutablePerson {
    private final String name;

    public ImmutablePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
