package com.sda.exercises.classes.inheritance.examples.magicians;

public class RonTheMagician implements Magician {
    private final String name = "Ron";

    /**
     * Uses default implementation of castASpell
     */

    @Override
    public String whatIsYourName() {
        return name;
    }
}
