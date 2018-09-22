package com.sda.exercises.classes.examples;

public class DogApp {
    public static void main(String[] args) {
        Dog rexTheDog = new Dog("Rex", Type.GOLDEN_RETRIEVER);
        System.out.println(rexTheDog.introduceYourself());

        Dog doggoTheDog = new Dog("Doggo");
        System.out.println(doggoTheDog.introduceYourself());
    }
}
