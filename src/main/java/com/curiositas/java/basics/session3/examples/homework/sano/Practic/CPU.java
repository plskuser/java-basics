package com.curiositas.java.basics.session3.examples.homework.sano.Practic;

public class CPU implements Parts {


    boolean isPlugged = false;


    public String Working(boolean isWorking) {
        if (isWorking) {
            return "CPU is Works";
        } else {
            return "OFF";
        }
    }

    public String Plugged(boolean isPlugged) {
        this.isPlugged = isPlugged;
        if (isPlugged) {
            return "CPU is Plugged";
        } else {
            return "Unplugged";
        }
    }

    public boolean isPlugged() {
        return isPlugged;
    }

    @Override
    public String Breaks(boolean isBreaks) {
        if (isBreaks) {
            return "CPU is Broken";
        } else {
            return "CPU is broken";
        }
    }
}
