package com.sda.exercises.classes.inheritance.examples.magicians;

import com.sda.exercises.BaseExample;

public class MagicianExample extends BaseExample {
    public static void main(String[] args) {
        Magician harry = new HarryTheMagician();
        harry.castASpell();

        System.out.println(EXAMPLE_DELIMITER);

        Magician ron = new RonTheMagician();
        ron.castASpell();
    }
}
