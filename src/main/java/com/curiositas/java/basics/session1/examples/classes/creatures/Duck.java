package com.curiositas.java.basics.session1.examples.classes.creatures;

public class Duck extends Flying {
    @Override
    public String say() {
        return name() + " says \"Quack\"";
    }

    @Override
    public String name() {
        return "Duck";
    }
}
