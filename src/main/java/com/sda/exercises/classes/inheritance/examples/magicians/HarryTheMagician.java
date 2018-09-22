package com.sda.exercises.classes.inheritance.examples.magicians;

public class HarryTheMagician implements Magician {
    private final String name = "Harry";

    @Override
    public void castASpell() {
        System.out.println("Abrakadabra!");
    }

    @Override
    public String whatIsYourName() {
        return name;
    }
}
