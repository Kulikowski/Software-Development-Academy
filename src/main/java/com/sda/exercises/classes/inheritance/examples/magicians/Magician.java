package com.sda.exercises.classes.inheritance.examples.magicians;

public interface Magician {
    default void castASpell() {
        System.out.println("Shazam!!!");
    }

    String whatIsYourName();
}
