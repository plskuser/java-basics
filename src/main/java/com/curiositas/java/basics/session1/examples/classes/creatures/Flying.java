package com.curiositas.java.basics.session1.examples.classes.creatures;

public abstract class Flying implements Creature {
    @Override
    public String move() {
        return name() + " fly with wings";
    }
}
