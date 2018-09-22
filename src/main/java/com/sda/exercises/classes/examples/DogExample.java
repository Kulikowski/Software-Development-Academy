package com.sda.exercises.classes.examples;

import com.sda.exercises.BaseExample;

public class DogExample extends BaseExample {
    public static void main(String[] args) {
        Dog rexTheDog = new Dog("Rex", Type.GOLDEN_RETRIEVER);
        System.out.println(rexTheDog.introduceYourself());

        System.out.println(EXAMPLE_DELIMITER);

        Dog doggoTheDog = new Dog("Doggo");
        System.out.println(doggoTheDog.introduceYourself());
    }
}
